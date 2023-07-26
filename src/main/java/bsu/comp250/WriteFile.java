package bsu.comp250;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public void writeFile(String[] wordsArray, String filename) throws IOException {
        // Creating a string to hold the new filename
        String stringFileName = filename + "_words.txt";

        // Instantiating FileWriter object
        FileWriter fileWriter = new FileWriter(stringFileName, false);
        // This line simply writes at the top of the file how many words items are in the array (number of words)
        fileWriter.write(wordsArray.length + "\n");
        // This loop adds words and indices to the file provided the line is not blank
        // It also strips any word of any leading and trailing non-alphanumeric using the removeNonalpha method
        RemoveNonalpha removeNonalpha = new RemoveNonalpha();
        for (int i = 0; i < wordsArray.length; i++) {
            if (!wordsArray[i].isBlank()) {
                fileWriter.write(removeNonalpha.removeNonalpha(wordsArray[i].strip()) + " " + i + "\n");
            }
        }
        fileWriter.close();
        // Calling the mergeSort method in the MergeSort class, passing in the filename as a String,
        // and the length of the given array
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(stringFileName, wordsArray.length);
    }
}
