package bsu.comp250;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class StringBuilder {
    public String originalString;

    public String StringBuilder(String filename)  throws IOException {

        Path stringFilename = Path.of(filename);
        originalString = Files.readString(stringFilename);
        return originalString;

//        String fileName = filename;
//        File textToParse = new File(fileName);
//        StringBuilder stringBuilder = new StringBuilder();
//        try (Scanner scanner = new Scanner(filename)){
//            while (scanner.hasNextLine()) {
//                stringBuilder.;
//
//            }
//            scanner.close();
//            return originalString;
//
//        }
//        catch (FileNotFoundException e) {
//            System.err.println("File not found: " + e.getMessage());

        //return " ";
    }
}
