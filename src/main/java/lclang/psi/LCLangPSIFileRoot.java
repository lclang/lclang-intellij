package lclang.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import lclang.Constants;
import lclang.files.LCLangFileType;
import org.antlr.intellij.adaptor.SymtabUtils;
import org.antlr.intellij.adaptor.psi.ScopeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class LCLangPSIFileRoot extends PsiFileBase implements ScopeNode {
    public LCLangPSIFileRoot(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, Constants.LANGUAGE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return LCLangFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Sample Language file";
    }

    @Override
    public Icon getIcon(int flags) {
        return null;
    }

    /** Return null since a file scope has no enclosing scope. It is
     *  not itself in a scope.
     */
    @Override
    public ScopeNode getContext() {
        return null;
    }

    @Nullable
    @Override
    public PsiElement resolve(PsiNamedElement element) {
//		System.out.println(getClass().getSimpleName()+
//		                   ".resolve("+element.getName()+
//		                   " at "+Integer.toHexString(element.hashCode())+")");
//        if (element.getParent() instanceof CallSubtree) {
//            return SymtabUtils.resolve(this, Constants.LANGUAGE,
//                    element, "/script/function/ID");
//        }

        return SymtabUtils.resolve(this, Constants.LANGUAGE,
                element, "/file/expression/primitive/link/ID");
    }
}

