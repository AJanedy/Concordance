//package bsu.comp250;
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class PrintSorted {
//    String newFilename = null;
//    public void printSorted(String[] wordsArray, int[] indicesArray, String fileName) throws IOException {
//        String newFilename = fileName + "_sorted.txt";
//        int count = 0;
//        // Instantiating FileWriter object
//        FileWriter fileWriter = new FileWriter(newFilename, false);
//        // This loop adds words and indices to the file provided the line is not blank
//        fileWriter.write(wordsArray[0] + " + " + indicesArray[0]);
//        for (int i = 1; i < wordsArray.length; i++) {
//            fileWriter.write(wordsArray[i] + " " + indicesArray[i] + "\n");
//        }
//        fileWriter.flush();
//        fileWriter.close();
//    }
//
//    public void printIndex(String[] wordsArray, int[] indicesArray, String fileName) throws IOException {
//
//        newFilename = fileName + "_index.txt";
//        int count = 0;
//        // Instantiating FileWriter object
//        FileWriter fileWriter = new FileWriter(newFilename, false);
//        // This loop adds words and indices to the file provided the line is not blank
//        fileWriter.write(wordsArray[0] + " + " + indicesArray[0]);
//        for (int i = 1; i < wordsArray.length; i++) {
//            if (wordsArray[i].equalsIgnoreCase(wordsArray[i - 1])) {
//                fileWriter.write(" " + indicesArray[i]);
//            } else {
//                fileWriter.write("\n" + wordsArray[i] + " " + indicesArray[i]);
//            }
//        }
//        fileWriter.flush();
//        fileWriter.close();
//    }
//    public String getFileName() {
//        return newFilename;
//    }
//}
