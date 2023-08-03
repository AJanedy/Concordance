package bsu.comp250;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

// This class simply counts the words in a .txt file so we know what size of an array to build later
public class CountWords {
    public int CountWords(String filename) throws IOException {

        int wordcount = 0;

        try {
            // Creates a File object to be passed into the Scanner object
            String fileName = filename;
            File textToParse = new File(fileName);
            // File is then passed into the Scanner object
            Scanner scanner = new Scanner(textToParse);
            while (scanner.hasNext()) {
                String word = scanner.next();
                wordcount++;
            }
            scanner.close();
            return wordcount;

        }
        catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
        return 0;
    }
}
