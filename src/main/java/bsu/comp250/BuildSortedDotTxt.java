package bsu.comp250;

import java.io.FileWriter;
import java.io.IOException;

public class BuildSortedDotTxt {
    String stringFileName;
    public void BuildSortedDotTxt(String[] wordsArray, String filename, int length) throws IOException {
        stringFileName = filename + "_sorted.txt";
        FileWriter fileWriter = new FileWriter(stringFileName, false);
        fileWriter.write(length + "\n");
        for (int i = 0; i < wordsArray.length; i++) {
            if (!wordsArray[i].isBlank()) {
                fileWriter.write(wordsArray[i].strip() + " " + i + "\n");
            }
        }
        fileWriter.close();
    }
}
