//package bsu.comp250;
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class WriteFile {
//    String stringFileName;
//    MergeSort mergeSort = new MergeSort();
//    public void writeFile(String[] wordsArray, String filename, long startTime) throws IOException {
//        // string to hold the new filename
//        stringFileName = filename + "_words.txt";
//        // Instantiating FileWriter object
//        FileWriter fileWriter = new FileWriter(stringFileName, false);
//        // This line simply writes at the top of the file how many words items are in the array (number of words)
//        fileWriter.write(wordsArray.length + "\n");
//        // This loop adds words and indices to the file provided the line is not blank
//        // It also strips any word of any leading and trailing non-alphanumeric using the removeNonalpha method
//        RemoveNonalpha removeNonalpha = new RemoveNonalpha();
//        for (int i = 0; i < wordsArray.length; i++) {
//            if (!wordsArray[i].isBlank()) {
//                fileWriter.write(removeNonalpha.removeNonalpha(wordsArray[i].strip()) + " " + i + "\n");
//            }
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("\nIt took " + (endTime - startTime) + " ms to read in " + filename +
//                " and generate " + stringFileName);
//        fileWriter.flush();
//        fileWriter.close();
//        // Calling the mergeSort method in the MergeSort class, passing in the filename as a String, the original
//        // filename, and the length of the given array
//        mergeSort.readFile(stringFileName, filename);
//    }
//    public String getStringFileName() {
//        return mergeSort.getFileName();
//    }
//}
