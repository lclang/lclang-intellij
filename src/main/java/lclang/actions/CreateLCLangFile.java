package lclang.actions;

import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.ide.fileTemplates.FileTemplate;
import com.intellij.ide.fileTemplates.actions.AttributesDefaults;
import com.intellij.ide.fileTemplates.ui.CreateFromTemplateDialog;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.util.Properties;

public class CreateLCLangFile extends CreateFileFromTemplateAction {

    public CreateLCLangFile() {
        super("LCLang File", "Create The little cat language file", null);
    }

    @Override
    protected void buildDialog(@NotNull Project project,
                               @NotNull PsiDirectory psiDirectory,
                               @NotNull CreateFileFromTemplateDialog.Builder builder) {
        builder
                .setTitle("LCLang File")
                .addKind("Empty file", null, "LCLang File")
                .addKind("Class", null, "LCLang Class");
    }

    @Override
    protected PsiFile createFileFromTemplate(String name, FileTemplate template, PsiDirectory dir) {
        try {
            Properties properties = new Properties();
            properties.setProperty("NAME", name);

            return new CreateFromTemplateDialog(dir.getProject(), dir, template, new AttributesDefaults(name)
                    .withFixedName(true), properties).create().getContainingFile();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected String getActionName(PsiDirectory psiDirectory,
                                   @NonNls @NotNull String s,
                                   @NonNls String s1) {
        return "LCLang File";
    }
}
