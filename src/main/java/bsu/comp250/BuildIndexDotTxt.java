package bsu.comp250;

import java.io.FileWriter;
import java.io.IOException;

// Class used to build the _index.txt file by iterating through the indexedWords array of IndexedWordObject objects
// and writing each word and corresponding index on their own line, but instead of repeating words, it creates a single
// line, listing the word just once, with each index occurence following on the same line
public class BuildIndexDotTxt {
    String stringFileName;
    int arrayLength = 0; // This will allow us to build an array of the exact size needed for our
                         // sortedArray that will be created when we query and search
    public void BuildIndexDotTxt(IndexedWordObject[] indexedWords, String filename) throws IOException {
        stringFileName = filename + "_index.txt";
        FileWriter fileWriter = new FileWriter(stringFileName, false);
        fileWriter.write(indexedWords[0].word + " " + indexedWords[0].index);
        arrayLength++;
        for (int i = 1; i < indexedWords.length; i++) {
            if (indexedWords[i].word.equalsIgnoreCase(indexedWords[i - 1].word)) {
                fileWriter.write(" " + indexedWords[i].index);
            } else {
                fileWriter.write("\n" + indexedWords[i].word + " " + indexedWords[i].index);
                arrayLength++;
            }
        }
        fileWriter.close();
    }
    public int getArrayLength() {
        return arrayLength;
    }
}
