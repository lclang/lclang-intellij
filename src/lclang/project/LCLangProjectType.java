package lclang.project;

import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.module.ModuleTypeManager;
import com.intellij.util.PlatformIcons;
import lclang.Constants;
import lclang.Icons;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class LCLangProjectType extends ModuleType<LCLangProjectBuilder> {
    protected LCLangProjectType() {
        super(Constants.PROJECT_TYPE_ID);
    }

    @Override
    public @NotNull LCLangProjectBuilder createModuleBuilder() {
        return new LCLangProjectBuilder();
    }

    @Override
    public @NotNull
    @Nls(capitalization = Nls.Capitalization.Title) String getName() {
        return "LCLang Project";
    }

    @Override
    public @NotNull
    @Nls(capitalization = Nls.Capitalization.Sentence) String getDescription() {
        return "Create LCLang project";
    }

    @Override
    public @NotNull Icon getNodeIcon(boolean b) {
        return Icons.FILE;
    }
}
