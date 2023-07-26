//package bsu.comp250;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class MergeSort {
//    public void mergeSort(String filepath, int length) throws IOException {
//        String fileName = filepath;
//        String[] listOfWords = new String[length];
//        int [] listOfIndices = new int[length];
//
//        try {
//            // Creates a File object to be passed into the Scanner object
//            File textToParse = new File(fileName);
//            // File is then passed into the Scanner object
//            Scanner scanner = new Scanner(textToParse);
//            // FIXME
//            // Reads each word and adds it to the ArrayList "listOfWords
//            while (scanner.hasNext()) {
//                for (int i = 0; i < length; i++) {
//                    String[] thisLine = scanner.nextLine().split(" ");
//                    listOfWords[i] = thisLine[0];
//                    listOfIndices[i] = Integer.parseInt(thisLine[1]);
//                }
//            }
//            for (int i = 0; i < length; i++) {
//                System.out.println(listOfWords[i] + " + " + listOfIndices[i]);
//            }
//            scanner.close();
//        }
//        catch (FileNotFoundException e) {
//            System.err.println("File not found: " + e.getMessage());
//            return;
//        }
//    }
//}
