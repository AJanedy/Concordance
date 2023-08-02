package bsu.comp250;

import java.util.Locale;

public class CleanWords {
    public String[] Cleanwords(String[] wordsArray, int length) {
        String[] cleanedWordsArray = new String[length];
        RemoveNonalpha removeNonalpha = new RemoveNonalpha();
        for (int i = 0; i < length; i++) {
            cleanedWordsArray[i] = removeNonalpha.RemoveNonalpha(wordsArray[i].toLowerCase(Locale.ROOT));
        }
        return cleanedWordsArray;
    }
}
