public class UC5PrintOOPS {

    public static void main(String[] args) {

        System.out.println("OOPS Banner App - UC5: Inline Array Initialization\n");

        // Declare and initialize array in a single statement
        String[] banner = {

                String.join(" ",
                        "  *****  ",
                        "  *****  ",
                        " ******* ",
                        " ******* "),

                String.join(" ",
                        " **   ** ",
                        " **   ** ",
                        " **   ** ",
                        " **      "),

                String.join(" ",
                        "**     **",
                        "**     **",
                        "**     **",
                        " **      "),

                String.join(" ",
                        "**     **",
                        "**     **",
                        " ******* ",
                        "  *****  "),

                String.join(" ",
                        "**     **",
                        "**     **",
                        " **      ",
                        "      ** "),

                String.join(" ",
                        " **   ** ",
                        " **   ** ",
                        " **      ",
                        " **   ** "),

                String.join(" ",
                        "  *****  ",
                        "  *****  ",
                        " **      ",
                        "  *****  ")
        };

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}