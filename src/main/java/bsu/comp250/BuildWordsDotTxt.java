package bsu.comp250;
import java.io.FileWriter;
import java.io.IOException;

// Class used to build the _words.txt file by iterating through the cleanedWordsArray and writing each word
// and corresponding index on their own line
public class BuildWordsDotTxt {
    String stringFileName;
    public void BuildWordsDotTxt(String[] wordsArray, String filename, int length) throws IOException {
        stringFileName = filename + "_words.txt";
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
