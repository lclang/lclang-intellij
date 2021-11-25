package lclang.configurations;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.*;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.process.ProcessHandlerFactory;
import com.intellij.execution.process.ProcessTerminatedListener;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.components.StoredProperty;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.LabeledComponent;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.openapi.util.SystemInfo;
import org.jdesktop.swingx.VerticalLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RunFileConfiguration extends RunConfigurationBase<RunFileConfiguration.RunFileOptions> {

    protected RunFileConfiguration(@NotNull Project project, @Nullable ConfigurationFactory factory, @Nullable String name) {
        super(project, factory, name);
    }

    @Override
    public @NotNull SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
        return new RunFileConfigurationEditor(getProject());
    }

    @Override
    public @Nullable
    RunProfileState getState(@NotNull Executor executor,
                             @NotNull ExecutionEnvironment executionEnvironment) {
        return new CommandLineState(executionEnvironment) {
            @NotNull
            @Override
            protected ProcessHandler startProcess() throws ExecutionException {
                GeneralCommandLine commandLine = new GeneralCommandLine();
                if(SystemInfo.isWindows){
                    commandLine.setExePath("lclang.bat");
                }else commandLine.setExePath("lclang");


                commandLine.addParameter("-f");
                commandLine.addParameter(getOptions().getFilePath());

                OSProcessHandler processHandler = ProcessHandlerFactory.getInstance().createColoredProcessHandler(commandLine);
                ProcessTerminatedListener.attach(processHandler);
                return processHandler;
            }
        };
    }

    @NotNull
    @Override
    protected RunFileOptions getOptions() {
        return (RunFileOptions) super.getOptions();
    }

    @Override
    public void checkConfiguration() {

    }

    public static class RunFileOptions extends RunConfigurationOptions {
        private final StoredProperty<String> filePath = string("")
                .provideDelegate(this, "filePath");

        public String getFilePath() {
            return filePath.getValue(this);
        }

        public void setFilePath(String newFilePath) {
            filePath.setValue(this, newFilePath);
        }
    }
    public static class RunFileConfigurationEditor extends SettingsEditor<RunFileConfiguration> {
        private final JPanel panel = new JPanel(new VerticalLayout(0));
        private final LabeledComponent<TextFieldWithBrowseButton> fileName;

        public RunFileConfigurationEditor(Project project) {
            fileName = new LabeledComponent<>();
            fileName.getLabel().setText("File path: ");
            fileName.setComponent(new TextFieldWithBrowseButton());
            FileChooserDescriptor descriptor = new FileChooserDescriptor(
                    true,
                    false,
                    false,
                    false,
                    false,
                    false);

            fileName.getComponent().addBrowseFolderListener("Select File", null, project, descriptor);
            panel.add(fileName);
        }

        @Override
        protected void resetEditorFrom(RunFileConfiguration configuration) {
            fileName.getComponent().setText(configuration.getOptions().getFilePath());
        }

        @Override
        protected void applyEditorTo(@NotNull RunFileConfiguration configuration) {
            configuration.getOptions().setFilePath(fileName.getComponent().getText());
        }

        @NotNull
        @Override
        protected JComponent createEditor() {
            return panel;
        }
    }
}
