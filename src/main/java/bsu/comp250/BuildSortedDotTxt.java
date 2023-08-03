package bsu.comp250;
import java.io.FileWriter;
import java.io.IOException;

// Class used to build the _sorted.txt file by iterating through the indexedWords array of IndexedWordObject objects
// and writing each word and corresponding index on their own line, giving us an alphabetized list of words
// in the given text.
public class BuildSortedDotTxt {
    String stringFileName;
    public void BuildSortedDotTxt(IndexedWordObject[] indexedWords, String filename) throws IOException {
        stringFileName = filename + "_sorted.txt";
        int length = indexedWords.length;
        FileWriter fileWriter = new FileWriter(stringFileName, false);
        fileWriter.write(length + "\n");
        for (int i = 0; i < indexedWords.length; i++) {
            if (!indexedWords[i].word.isBlank()) {
                fileWriter.write(indexedWords[i].word.strip() + " " + indexedWords[i].index + "\n");
            }
        }
        fileWriter.close();
    }
}
