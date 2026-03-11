import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Static method to initialize and return the character pattern map
    static Map<String, String[]> initializePatternMap() {
        Map<String, String[]> patternMap = new HashMap<>();

        patternMap.put("O", new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        patternMap.put("P", new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });

        patternMap.put("S", new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        });

        return patternMap;
    }

    // Static method to render banner for a given word using HashMap lookup
    static void renderBanner(String word, Map<String, String[]> patternMap) {
        String gap = "   ";
        int lineCount = 7; // Height of character pattern

        // Build and display each line of the banner
        for (int line = 0; line < lineCount; line++) {
            StringBuilder lineBuilder = new StringBuilder();

            // Iterate through each character in the word
            for (int charIndex = 0; charIndex < word.length(); charIndex++) {
                String character = word.substring(charIndex, charIndex + 1).toUpperCase();

                // Retrieve pattern from HashMap using character as key
                String[] pattern = patternMap.get(character);

                // Check if character pattern exists in map
                if (pattern != null) {
                    lineBuilder.append(pattern[line]);

                    // Add gap between characters (except after the last character)
                    if (charIndex < word.length() - 1) {
                        lineBuilder.append(gap);
                    }
                }
            }

            // Display the line
            System.out.println(lineBuilder.toString());
        }
    }

    public static void main(String[] args) {
        // Initialize the character pattern map
        Map<String, String[]> patternMap = initializePatternMap();

        // Render banner for "OOPS" using HashMap lookup and render function
        renderBanner("OOPS", patternMap);
    }
}
