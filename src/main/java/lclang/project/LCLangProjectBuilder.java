package lclang.project;

import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.twelvemonkeys.io.FileUtil;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class LCLangProjectBuilder extends ModuleBuilder {

    @Override
    public ModuleType<?> getModuleType() {
        return new LCLangProjectType();
    }

    @Override
    public String getGroupName() {
        return getModuleType().getName();
    }

    @Override
    public @Nls(capitalization = Nls.Capitalization.Title) String getPresentableName() {
        return getModuleType().getName();
    }

    @Override
    public String getDescription() {
        return getModuleType().getDescription();
    }

    @Override
    public void setupRootModel(@NotNull ModifiableRootModel modifiableModel) throws ConfigurationException {
        super.setupRootModel(modifiableModel);
        modifiableModel.inheritSdk();
        ContentEntry[] contentEntries = modifiableModel.getContentEntries();
        if(contentEntries.length!=0){
            ContentEntry contentEntry = contentEntries[0];
            contentEntry.addSourceFolder(
                    Objects.requireNonNull(modifiableModel.getProject().getProjectFile()), false);
            modifiableModel.commit();
        }

        File moduleConfig = new File(modifiableModel.getProject().getBasePath(), "main.lcat");
        try {
            FileUtil.write(moduleConfig, ("println(\"Hello, World!\")").getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override public boolean isOpenProjectSettingsAfter() {
        return false;
    }
    @Override public boolean canCreateModule() {
        return false;
    }
}