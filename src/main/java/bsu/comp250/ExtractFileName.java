package bsu.comp250;

public class ExtractFileName {
    public String extractFileName(String filepath) {
        // Find the index of the last occurence of \\
        int lastBackslashIndex = filepath.lastIndexOf("\\");
        // Extract the substring following this last backslash
        String filename = filepath.substring(lastBackslashIndex + 1);

        return filename;
    }
}
