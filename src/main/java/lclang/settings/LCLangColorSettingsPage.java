package lclang.settings;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import lclang.Icons;
import lclang.LCLangSyntaxHighlighter;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class LCLangColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Keyword", LCLangSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Line comment", LCLangSyntaxHighlighter.LINE_COMMENT),
            new AttributesDescriptor("Block comment", LCLangSyntaxHighlighter.BLOCK_COMMENT),
            new AttributesDescriptor("Identifier", LCLangSyntaxHighlighter.ID),
            new AttributesDescriptor("Bad value", LCLangSyntaxHighlighter.BAD_CHARACTER),
    };

    @Override
    public @Nullable Icon getIcon() {
        return Icons.FILE;
    }

    @Override
    public @NotNull SyntaxHighlighter getHighlighter() {
        return new LCLangSyntaxHighlighter();
    }

    @Override
    public @NonNls
    @NotNull String getDemoText() {
        return "count = 0\n" +
                "thread(-> {\n" +
                "   while count<20: count++\n" +
                "})\n\n" +
                "while count <20\n" +
                "println(count)\n\n" +
                "method test(text: string): void {\n" +
                "   println(test)" +
                "}\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Little Cat Language";
    }
}
