package lclang.configurations;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.components.BaseState;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RunFileConfigurationFactory extends ConfigurationFactory {

    protected RunFileConfigurationFactory(@NotNull ConfigurationType type) {
        super(type);
    }

    @Override
    public @NotNull String getId() {
        return RunFileConfigurationType.ID;
    }

    @NotNull
    @Override
    public RunConfiguration createTemplateConfiguration(@NotNull Project project) {
        return new RunFileConfiguration(project, this, "Run File");
    }

    @Nullable
    @Override
    public Class<? extends BaseState> getOptionsClass() {
        return RunFileConfiguration.RunFileOptions.class;
    }
}
