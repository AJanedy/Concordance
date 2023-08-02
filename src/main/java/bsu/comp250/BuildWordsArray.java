package bsu.comp250;

import java.util.Scanner;

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
