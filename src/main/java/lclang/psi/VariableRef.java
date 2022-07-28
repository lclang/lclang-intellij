package lclang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class VariableRef extends ElementRef {
    public VariableRef(@NotNull IdentifierPSINode element) {
        super(element);
    }

    @Override
    public boolean isDefSubtree(PsiElement def) {
        return false;
    }
}