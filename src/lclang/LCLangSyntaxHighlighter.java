package lclang;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class LCLangSyntaxHighlighter extends SyntaxHighlighterBase {
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    public static final TextAttributesKey ID =
            createTextAttributesKey("LCLANG_ID", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("LCLANG_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("LCLANG_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("LCLANG_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey LINE_COMMENT =
            createTextAttributesKey("LCLANG_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT =
            createTextAttributesKey("LCLANG_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("LCLANG_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(Constants.LANGUAGE,
                lclangParser.tokenNames,
                lclangParser.ruleNames);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new ANTLRLexerAdaptor(Constants.LANGUAGE, new lclangLexer(null));
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (!(tokenType instanceof TokenIElementType)) return EMPTY_KEYS;
        TokenIElementType myType = (TokenIElementType)tokenType;

        TextAttributesKey attrKey;
        switch (myType.getANTLRTokenType()) {
            case lclangLexer.ID :
                attrKey = ID;
                break;

            case lclangLexer.STRING :
            case lclangLexer.CHAR :
                attrKey = STRING;
                break;

            case lclangLexer.WHILE :
            case lclangLexer.IF :
            case lclangLexer.ELSE :
            case lclangLexer.RETURN :
            case lclangLexer.METHOD :
            case lclangLexer.CLASS :
            case lclangLexer.BOOL :
            case lclangLexer.STOP :
            case lclangLexer.COMPONENT :
            case lclangLexer.GLOBAL :
            case lclangLexer.USE :
            case lclangLexer.FROM :
            case lclangLexer.IS :
            case lclangLexer.EXTENDS :
            case lclangLexer.NULL :
                attrKey = KEYWORD;
                break;

            case lclangLexer.INTEGER :
            case lclangLexer.HEX_LONG :
            case lclangLexer.DOUBLE :
            case lclangLexer.LONG :
                attrKey = NUMBER;
                break;

            case lclangLexer.COMMENT :
                attrKey = LINE_COMMENT;
                break;

            case lclangLexer.LINE_COMMENT :
                attrKey = BLOCK_COMMENT;
                break;

            case lclangLexer.ERRCHAR:
                attrKey = BAD_CHARACTER;
                break;

            default : return EMPTY_KEYS;
        }

        return new TextAttributesKey[] {attrKey};
    }
}
