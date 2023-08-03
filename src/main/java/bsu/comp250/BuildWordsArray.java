package bsu.comp250;
import java.util.Scanner;

// A class to build out uncleanedWordsArray.  It is passed in the original file as a String and reads each word
// as its own string and adds it to the corresponding location in the array.  The array uncleanedWordsArray is used
// again later in QueryAndSearch to rebuild the words surrounding the searched words
public class BuildWordsArray {
    public String[] BuildWordsArray(String originalText, int length) {
        String[] wordsArray = new String[length];
        Scanner scanner = new Scanner(originalText);
        for (int i = 0; i < length; i++) {
            String word = scanner.next();
            wordsArray[i] = word;
        }
        return wordsArray;
    }
}
