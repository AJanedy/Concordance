//package bsu.comp250;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class QueryAndSearch {
//    public void searchQuery(String filename, int arrayLength, String[] unadulteratedArray) throws IOException {
//
//        String indexFile = filename;
//        String searchWord;
//        ArrayList<String> listOfWords = new ArrayList<>();
//        ArrayList<String> listOfIndices = new ArrayList<>();
//        String[] wordsArray;
//        String[] indicesArray;
//
//        System.out.println("Searching for words in " + indexFile);
//
//        try {
//            // Instantiating a File object to pass into the instantiated Scanner object
//            File textToParse = new File(indexFile);
//            Scanner scanner = new Scanner(textToParse);
//            // Adding each element of the file into it's corresponding index in the array
//            for (int i = 0; i < arrayLength; i++) {
//                while (scanner.hasNext()) {
//                    listOfWords.add(scanner.next());
//                    listOfIndices.add(scanner.nextLine());
//                }
//            }
//            wordsArray = listOfWords.toArray(new String[0]);
//            indicesArray = listOfIndices.toArray(new String[0]);
//            scanner.close();
//        }
//        catch (FileNotFoundException e) {
//            System.err.println("File not found: " + e.getMessage());
//            return;
//        }
//        // A loop to continually ask the user what word they would like to search
//        // that breaks only if a specific input is passed in
//        while (true) {
//
//            System.out.println();
//            System.out.println("What word would you like to search for?");
//            System.out.println("Type \"Exit1\" to exit");
//
//            // Instantiating a new Scanner object for user input
//            Scanner indexQuery = new Scanner(System.in);
//            searchWord = indexQuery.nextLine();
//
//            // Allows the loop to break, this break will send the program back to Main, if there are any more
//            // files to read it will go to the next text file, otherwise the program will end
//            if (searchWord.compareTo("Exit1") == 0) {
//                break;
//            }
//            // Takes the user input then compares it to the array, returning the sentence containing the search word
//            else {
//                int returnIndex = indexQuerySearch(wordsArray, indicesArray, searchWord);
//                // Prints a string indicating the search word was not found in the text
//                if (returnIndex == -1) {
//                    System.out.println("I cannot find this word in this text");
//                }
//                else {
//                    String stringOfIndices = indicesArray[returnIndex].trim();
//                    // Loops through the string containing the indices, splits at whitespace, prints each index,
//                    // then prints the 10 words on each side of the searched word
//                    for (String word : stringOfIndices.split(" ")) {
//                        System.out.print(word + ": ");
//                        for (int i = -10; i < 11; i++) {
//                            if (Integer.parseInt(word) + i >= 0 && Integer.parseInt(word) + i < unadulteratedArray.length) {
//                                System.out.print(unadulteratedArray[Integer.parseInt(word) + i] + " ");
//                            }
//                        }
//                        System.out.println();
//                        }
//                    }
//                }
//            }
//        //indexQuery.close();
//        }
//    public int indexQuerySearch(String[] wordsArray, String[] indicesArray, String wordToSearch) {
//        int low = 0;
//        int high = wordsArray.length;
//        // Binary search to find a specific word, ignoring case, in the original text
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            String middleWord = wordsArray[mid];
//
//            if (middleWord.compareToIgnoreCase(wordToSearch) == 0) {
//                return mid;
//            }
//            else if (middleWord.compareToIgnoreCase(wordToSearch) < 0) {
//                low = mid + 1;
//            }
//            else {
//                high = mid - 1;
//            }
//        }
//        return -1;
//    }
//}
