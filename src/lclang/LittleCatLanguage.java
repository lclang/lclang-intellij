package lclang;

import com.intellij.lang.Language;

public class LittleCatLanguage extends Language {
    public static final LittleCatLanguage INSTANCE = Constants.LANGUAGE;

    protected LittleCatLanguage() {
        super("LCLang");
    }
}
