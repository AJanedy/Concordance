package bsu.comp250;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public void readFile(String filePath) throws IOException {
        // Declares and defines an arrayList that will later be converted to an array
        ArrayList<String> listOfWords = new ArrayList<>();
        // FIXME: eliminate arraylist.  Iterate twice, count once, build
        try {
            // Creates a File object to be passed into the Scanner object
            File textToParse = new File(filePath);
            // File is then passed into the Scanner object
            Scanner scanner = new Scanner(textToParse);

            // Reads each word and adds it to the ArrayList "listOfWords
            while (scanner.hasNext()) {
                String word = scanner.next();
                listOfWords.add(word);
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            return;
        }
        // Converts the ArrayList into a fixed Array
        String[] wordsArray = listOfWords.toArray(new String[0]);

        // Calling the writeFile method, passing in the newly created array and the filename, extracted from the filepath
        WriteFile writeFile = new WriteFile();
        //ExtractFileName extractName = new ExtractFileName();
        //ExtractFileName.extractFileName(filePath);
        writeFile.writeFile(wordsArray, filePath);//extractName.extractFileName(filePath));
        //writeFile(wordsArray, extractFileName(filePath));
    }
}
