package lclang;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import lclang.psi.BlockSubtree;
import lclang.psi.LCLangPSIFileRoot;
import lclang.psi.MethodSubtree;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.RuleIElementType;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor;
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class LCLangParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(Constants.LANGUAGE);
    public static TokenIElementType ID;

    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(Constants.LANGUAGE,
                lclangParser.tokenNames,
                lclangParser.ruleNames);
        List<TokenIElementType> tokenIElementTypes =
                PSIElementTypeFactory.getTokenIElementTypes(Constants.LANGUAGE);
        ID = tokenIElementTypes.get(lclangLexer.ID);
    }

    public static final TokenSet COMMENTS =
            PSIElementTypeFactory.createTokenSet(
                    Constants.LANGUAGE,
                    lclangLexer.COMMENT,
                    lclangLexer.LINE_COMMENT);

    public static final TokenSet WHITESPACE =
            PSIElementTypeFactory.createTokenSet(
                    Constants.LANGUAGE,
                    lclangLexer.WS);

    public static final TokenSet STRING =
            PSIElementTypeFactory.createTokenSet(
                    Constants.LANGUAGE,
                    lclangLexer.STRING);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new ANTLRLexerAdaptor(Constants.LANGUAGE, new lclangLexer(null));
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        final lclangParser parser = new lclangParser(null);
        return new ANTLRParserAdaptor(Constants.LANGUAGE, parser) {
            @Override
            protected ParseTree parse(Parser parser, IElementType root) {
                lclangParser parser1 = (lclangParser) parser;
                if (root instanceof IFileElementType) {
                    return parser1.file();
                }
                // let's hope it's an ID as needed by "rename function"
                return parser1.primitive();
            }
        };
    }

    /** "Tokens of those types are automatically skipped by PsiBuilder." */
    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITESPACE;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return STRING;
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new LCLangPSIFileRoot(viewProvider);
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        IElementType elType = node.getElementType();
        if (elType instanceof TokenIElementType) {
            return new ANTLRPsiNode(node);
        }

        if (!(elType instanceof RuleIElementType)) {
            return new ANTLRPsiNode(node);
        }

        RuleIElementType ruleElType = (RuleIElementType) elType;
        switch (ruleElType.getRuleIndex()) {
            case lclangParser.RULE_method :
                return new MethodSubtree(node, elType);
//            case SampleLanguageParser.RULE_vardef :
//                return new VardefSubtree(node, elType);
//            case SampleLanguageParser.RULE_formal_arg :
//                return new ArgdefSubtree(node, elType);
            case lclangParser.RULE_block :
                return new BlockSubtree(node);
//            case SampleLanguageParser.RULE_call_expr :
//                return new CallSubtree(node);

            default:
                return new ANTLRPsiNode(node);
        }
    }
}
