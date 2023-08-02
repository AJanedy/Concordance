//package bsu.comp250;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class MergeSort {
//    PrintSorted printSorted = new PrintSorted();
//    public void readFile(String filepath, String originalFilename) throws IOException {
//
//        String originalFileName = originalFilename;
//        String fileName = filepath;
//        String[] wordsArray;
//        int[] indicesArray;
//        int length;
//        long startTime = System.currentTimeMillis();
//        try {
//            // Creates a File object to be passed into the Scanner object
//            File textToParse = new File(fileName);
//            // File is then passed into the Scanner object
//            Scanner scanner = new Scanner(textToParse);
//            // The first element of the file being read in is the required length of the array needed
//            // to fit each subsequent element
//            length = scanner.nextInt();
//            scanner.nextLine();
//            // Declaring and initializing the array that will be used to store the words from the file
//            // read in as the array used to store their indices
//            wordsArray = new String[length];
//            indicesArray = new int[length];
//            // Reads each word and index adds them to the ArrayList "wordsArray" and "indicesArray" respectively
//            while (scanner.hasNext()) {
//                for (int i = 0; i < length; i++) {
//                    String[] tempArray = scanner.nextLine().split(" ");
//                    wordsArray[i] = tempArray[0];
//                    indicesArray[i] = Integer.parseInt(tempArray[1]);
//                }
//            }
//            scanner.close();
//        }
//
//        catch (FileNotFoundException e) {
//            System.err.println("File not found: " + e.getMessage());
//            return;
//        }
//        // Calling the sort method with the previously populated arrays
//        sort(wordsArray, indicesArray, 0, length - 1);
//        long endTime = System.currentTimeMillis();
//        System.out.println("It took " + (endTime - startTime) + " ms to execute merge sort");
//        double k = (endTime - startTime) / (wordsArray.length * Math.log(wordsArray.length));
//        System.out.println("For runtime = KNLog(N), N being the number of words in the array, K = " + k);
//        System.out.println();
//        // A call to the printSorted method in the PrintSorted class
//        printSorted.printSorted(wordsArray, indicesArray, originalFileName);
//        // A call to the printIndex method in the PrintSorted class
//        printSorted.printIndex(wordsArray, indicesArray, originalFileName);
//    }
//    public void sort(String[] arrayOfWords, int[] arrayOfIndices, int left, int right) {
//
//
//        // Calculating the middle index
//        int middle = (left + right) / 2;
//
//        if (arrayOfWords.length == 1) {
//            merge(arrayOfWords, arrayOfIndices, left, middle, right);
//        }
//        else if (left < right) {
//            // A call to sort on the left subarray
//            sort(arrayOfWords, arrayOfIndices, left, middle);
//            // A call to sort on the right subarray
//            sort(arrayOfWords, arrayOfIndices, middle + 1, right);
//            // Merging the sorted halves
//            merge(arrayOfWords, arrayOfIndices, left, middle, right);
//        }
//    }
//    public static void merge(String[] arrayOfWords, int[] arrayOfIndices, int left, int middle, int right) {
//
//        String[] tempWords = new String[arrayOfWords.length];
//        int[] tempIndices = new int[arrayOfIndices.length];
//
//        for (int i = left; i <= right; i++) {
//            tempWords[i] = arrayOfWords[i];
//            tempIndices[i] = arrayOfIndices[i];
//        }
//        // Pointer for the left, right, and merged subarray, respectively
//        int i = left;
//        int j = middle + 1;
//        int k = left;
//
//        // Merge the two subarrays in ascending order
//        while (i <= middle && j <= right) {
//            if (tempWords[i].compareToIgnoreCase(tempWords[j]) <= 0) {
//                arrayOfWords[k] = tempWords[i];
//                arrayOfIndices[k] = tempIndices[i];
//                i++;
//            } else {
//                arrayOfWords[k] = tempWords[j];
//                arrayOfIndices[k] = tempIndices[j];
//                j++;
//            }
//            k++;
//        }
//
//        // Copy any remaining elements from the left subarray (if any)
//        while (i <= middle) {
//            arrayOfWords[k] = tempWords[i];
//            arrayOfIndices[k] = tempIndices[i];
//            i++;
//            k++;
//        }
//
//        // Copy any remaining elements from the right subarray (if any)
//        while (j <= right) {
//            arrayOfWords[k] = tempWords[j];
//            arrayOfIndices[k] = tempIndices[j];
//            j++;
//            k++;
//        }
//    }
//    public String getFileName() {
//
//        return printSorted.getFileName();
//    }
//}
