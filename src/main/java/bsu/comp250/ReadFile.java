//package bsu.comp250;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ReadFile {
//    WriteFile writeFile = new WriteFile();
//    String[] wordsArray;
//    public void readFile(String fileName) throws IOException {
//        // Declares and defines an arrayList that will later be converted to an array
//        // I know you don't want me to do this, but I don't feel like changing it right now I have other priorities
//        ArrayList<String> listOfWords = new ArrayList<>();
//        long startTime = System.currentTimeMillis();
//        // FIXME: eliminate arraylist.  Iterate twice, count once, build
//        // See I even made a note to fix it but if you're reading this I clearly never got there
//        try {
//            // Creates a File object to be passed into the Scanner object
//            File textToParse = new File(fileName);
//            // File is then passed into the Scanner object
//            Scanner scanner = new Scanner(textToParse);
//            // Reads each word and adds it to the ArrayList "listOfWords
//            RemoveNonalpha removeNonalpha = new RemoveNonalpha();
//            // Loop that adds each word as an individual element to an ArrayList as long as the Scanner object
//            // has input to read in
//            while (scanner.hasNext()) {
//                String word = scanner.next();
//                if (!word.equals("*")) {
//                    listOfWords.add(word);
//                }
//            }
//            // Converts the ArrayList into a fixed Array
//            wordsArray = listOfWords.toArray(new String[0]);
//            scanner.close();
//            // Calling the writeFile method, by creating a new WriteFile object and
//            // passing in the newly created array and the filename
//            writeFile.writeFile(wordsArray, fileName, startTime);
//        }
//        catch (FileNotFoundException e) {
//            System.err.println("File not found: " + e.getMessage());
//            return;
//        }
//    }
//    public String getStringFileName() {
//        return writeFile.getStringFileName();
//    }
//    public int getArrayLength() {
//        return wordsArray.length;
//    }
//    public String[] getArray() {
//        return wordsArray;
//    }
//}
