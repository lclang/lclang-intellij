package lclang.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.tree.IElementType;
import lclang.Constants;
import lclang.LCLangParserDefinition;
import org.antlr.intellij.adaptor.lexer.RuleIElementType;
import org.antlr.intellij.adaptor.psi.ANTLRPsiLeafNode;
import org.antlr.intellij.adaptor.psi.Trees;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import static lclang.lclangParser.*;

public class IdentifierPSINode extends ANTLRPsiLeafNode implements PsiNamedElement {
    public IdentifierPSINode(IElementType type, CharSequence text) {
        super(type, text);
    }

    @Override
    public String getName() {
        return getText();
    }

    /** Alter this node to have text specified by the argument. Do this by
     *  creating a new node through parsing of an ID and then doing a
     *  replace.
     */
    @Override
    public PsiElement setName(@NonNls @NotNull String name) {
        if (getParent()==null) return this;
        PsiElement newID = Trees.createLeafFromText(getProject(),
                Constants.LANGUAGE,
                getContext(),
                name,
                LCLangParserDefinition.ID);
        if (newID!=null) {
            return this.replace(newID);
        }

        return this;
    }

    /** Create and return a PsiReference object associated with this ID
     *  node. The reference object will be asked to resolve this ref
     *  by using the text of this node to identify the appropriate definition
     *  site. The definition site is typically a subtree for a function
     *  or variable definition whereas this reference is just to this ID
     *  leaf node.
     *
     *  As the AST factory has no context and cannot create different kinds
     *  of PsiNamedElement nodes according to context, every ID node
     *  in the tree will be of this type. So, we distinguish references
     *  from definitions or other uses by looking at context in this method
     *  as we have parent (context) information.
     */
    @Override
    public PsiReference getReference() {
        PsiElement parent = getParent();
        IElementType elType = parent.getNode().getElementType();
        // do not return a reference for the ID nodes in a definition
        if ( elType instanceof RuleIElementType) {
            switch ( ((RuleIElementType) elType).getRuleIndex() ) {
                case RULE_stmt :
                case RULE_expression :
                case RULE_primitive :
                    return new VariableRef(this);
            }
        }
        return null;
    }
}
