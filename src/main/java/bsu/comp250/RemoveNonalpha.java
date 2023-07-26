package bsu.comp250;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNonalpha {
    public String removeNonalpha(String input) {
        // Defines a pattern to match non-alphanumeric characters
        Pattern pattern = Pattern.compile("^[^a-zA-Z0-9]*|[^a-zA-Z0-9]*$");
        // Creates an object to find the matches in the string
        Matcher matcher = pattern.matcher(input);

        return matcher.replaceAll("");
    }
}
