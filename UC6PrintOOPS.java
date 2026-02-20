public class UC6PrintOOPS {

    public static void main(String[] args) {

        System.out.println("OOPS Banner App - UC6: Using Methods\n");

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Final banner array (7 lines)
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]);
        }

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Method for Letter O
    public static String[] getOPattern() {
        return new String[] {
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        };
    }

    // Method for Letter P
    public static String[] getPPattern() {
        return new String[] {
                " ******* ",
                " **   ** ",
                " **   ** ",
                " ******* ",
                " **      ",
                " **      ",
                " **      "
        };
    }

    // Method for Letter S
    public static String[] getSPattern() {
        return new String[] {
                " ******* ",
                " **      ",
                " **      ",
                "  *****  ",
                "      ** ",
                "      ** ",
                " ******* "
        };
    }
}