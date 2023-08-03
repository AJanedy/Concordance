package bsu.comp250;
import java.util.Locale;

// CleanWords removes all leading and trailing non-alphanumeric characters from a String by calling removeNonAlpha
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
