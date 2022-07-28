package lclang.configurations;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class RunFileConfigurationType implements ConfigurationType {
    public static final String ID = "LCLangFileRun";

    @Override
    public @NotNull
    @Nls(capitalization = Nls.Capitalization.Title) String getDisplayName() {
        return "Run LCLang File";
    }

    @Override
    public @Nls(capitalization = Nls.Capitalization.Sentence) String getConfigurationTypeDescription() {
        return "Run LCLang file on your device";
    }

    @Override
    public Icon getIcon() {
        return null;
    }

    @Override
    public @NotNull
    @NonNls String getId() {
        return ID;
    }

    @Override
    public ConfigurationFactory[] getConfigurationFactories() {
        return new ConfigurationFactory[] {
                new RunFileConfigurationFactory(this)
        };
    }
}
