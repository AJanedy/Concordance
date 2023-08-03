package bsu.comp250;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// StringBuilder reads in the file and creates a single string containing the contents of that file
public class StringBuilder {
    public String originalString;
    public String StringBuilder(String filename)  throws IOException {

        Path stringFilename = Path.of(filename);
        originalString = Files.readString(stringFilename);
        return originalString;
    }
}
