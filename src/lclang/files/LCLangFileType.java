package lclang.files;

import com.intellij.openapi.fileTypes.LanguageFileType;
import lclang.Constants;
import lclang.Icons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class LCLangFileType extends LanguageFileType {
    public static final LCLangFileType INSTANCE = new LCLangFileType();

    protected LCLangFileType() {
        super(Constants.LANGUAGE);
    }

    @Override
    public @NotNull String getName() {
        return "Little Cat File";
    }

    @Override
    public @NotNull String getDescription() {
        return "Little Cat script file";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "lcat";
    }

    @Override
    public @Nullable Icon getIcon() {
        return Icons.FILE;
    }
}
