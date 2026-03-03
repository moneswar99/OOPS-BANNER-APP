import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    // -------------------------------
    // Utility Method 1:
    // Build and return HashMap of character patterns
    // -------------------------------
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> characterMap = new HashMap<>();

        characterMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        characterMap.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        characterMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        return characterMap;
    }

    // -------------------------------
    // Utility Method 2:
    // Render banner message
    // -------------------------------
    public static void renderBanner(String message, Map<Character, String[]> characterMap) {

        int height = 5; // Each letter has 5 rows

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);

                String[] pattern = characterMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    // -------------------------------
    // Main Method
    // -------------------------------
    public static void main(String[] args) {

        Map<Character, String[]> characterMap = buildCharacterMap();

        String message = "OOPS";

        renderBanner(message, characterMap);

        System.out.println("\nProgram executed successfully.");
    }
}