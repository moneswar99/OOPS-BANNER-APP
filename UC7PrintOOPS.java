/**
 * OOPS Banner App - UC7
 * Demonstrates storing character patterns inside an Inner Static Class.
 */
public class UC7PrintOOPS {

    /**
     * Inner Static Class to encapsulate Character and its Pattern
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         *
         * @param character the character
         * @param pattern   7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character
         *
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the 7-line pattern
         *
         * @return String array pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to create O pattern
     */
    public static CharacterPatternMap createOPattern() {
        return new CharacterPatternMap('O', new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        });
    }

    /**
     * Utility method to create P pattern
     */
    public static CharacterPatternMap createPPattern() {
        return new CharacterPatternMap('P', new String[]{
                " ******* ",
                " **   ** ",
                " **   ** ",
                " ******* ",
                " **      ",
                " **      ",
                " **      "
        });
    }

    /**
     * Utility method to create S pattern
     */
    public static CharacterPatternMap createSPattern() {
        return new CharacterPatternMap('S', new String[]{
                " ******* ",
                " **      ",
                " **      ",
                "  *****  ",
                "      ** ",
                "      ** ",
                " ******* "
        });
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        System.out.println("OOPS Banner App - UC7: Using Inner Static Class\n");

        // Create array of CharacterPatternMap objects
        CharacterPatternMap[] patterns = {
                createOPattern(),
                createOPattern(),
                createPPattern(),
                createSPattern()
        };

        // Build banner row by row
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (CharacterPatternMap patternObj : patterns) {
                lineBuilder.append(patternObj.getPattern()[row]).append(" ");
            }

            System.out.println(lineBuilder.toString());
        }
    }
}