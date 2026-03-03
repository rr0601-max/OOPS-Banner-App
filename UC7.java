public class UC7 {

    // Static inner class to encapsulate character pattern
    static class CharacterPatternMap {
        private String character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(String character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character name
        public String getCharacter() {
            return character;
        }

        // Getter for character pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        // Create CharacterPatternMap instances for O, P, S
        CharacterPatternMap O = new CharacterPatternMap("O", new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        CharacterPatternMap P = new CharacterPatternMap("P", new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });

        CharacterPatternMap S = new CharacterPatternMap("S", new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        });

        String gap = "   ";

        // Build banner lines using stored patterns retrieved via getters
        String[] lines = new String[7];
        for (int i = 0; i < 7; i++) {
            lines[i] = String.join(gap, O.getPattern()[i], O.getPattern()[i],
                                        P.getPattern()[i], S.getPattern()[i]);
        }

        // Display the banner using StringBuilder for efficient string building
        StringBuilder banner = new StringBuilder();
        for (String line : lines) {
            banner.append(line).append("\n");
        }
        System.out.print(banner);
    }
}
