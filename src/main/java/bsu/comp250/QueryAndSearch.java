package bsu.comp250;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QueryAndSearch {
    String[] wordsArray;
    String[] indicesArray;
    public void searchQuery(String filename, int arrayLength, String[] unadulteratedArray) throws IOException {

        wordsArray = new String[arrayLength];
        indicesArray = new String[arrayLength];

        System.out.println("Searching for words in " + filename);

        try {
            File textToParse = new File(filename);
            Scanner fileScanner = new Scanner(textToParse);

            while (fileScanner.hasNext()) {
                for (int i = 0; i < arrayLength; i++) {
                    wordsArray[i] = fileScanner.next();
                    indicesArray[i] = fileScanner.nextLine();
                }
            }
            fileScanner.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
        // A loop to continually ask the user what word they would like to search
        // that breaks only if a specific input is passed in
        while (true) {

            System.out.println();
            System.out.println("What word would you like to search for?");
            System.out.println("Type \"Exit1\" to exit");

            // Instantiating a new Scanner object for user input
            Scanner indexQuery = new Scanner(System.in);
            String searchWord = indexQuery.nextLine();

            // Allows the loop to break, this break will send the program back to Main, if there are any more
            // files to read it will go to the next text file, otherwise the program will end
            if (searchWord.compareTo("Exit1") == 0) {
                break;
            }
            // Takes the user input then compares it to the array, returning the sentence containing the search word
            else {
                int returnIndex = indexQuerySearch(wordsArray, indicesArray, searchWord);
                // Prints a string indicating the search word was not found in the text
                if (returnIndex == -1) {
                    System.out.println("I cannot find this word in this text");
                }
                else {
                    String stringOfIndices = indicesArray[returnIndex].trim();
                    // Loops through the string containing the indices, splits at whitespace, prints each index,
                    // then prints the 10 words on each side of the searched word
                    for (String word : stringOfIndices.split(" ")) {
                        System.out.print(word + ": ");
                        for (int i = -10; i < 11; i++) {
                            if (Integer.parseInt(word) + i >= 0 && Integer.parseInt(word) + i < unadulteratedArray.length) {
                                System.out.print(unadulteratedArray[Integer.parseInt(word) + i] + " ");
                            }
                        }
                        System.out.println();
                        }
                    }
                }
            }
        }
    public int indexQuerySearch(String[] wordsArray, String[] indicesArray, String wordToSearch) {
        int low = 0;
        int high = wordsArray.length;
        // Binary search to find a specific word, ignoring case, in the original text
        while (low <= high) {
            int mid = (low + high) / 2;
            String middleWord = wordsArray[mid];

            if (middleWord.compareToIgnoreCase(wordToSearch) == 0) {
                return mid;
            }
            else if (middleWord.compareToIgnoreCase(wordToSearch) < 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
