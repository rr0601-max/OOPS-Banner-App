public class UC6 {

    // Static helper method to generate the 'O' character pattern
    static String[] getO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Static helper method to generate the 'P' character pattern
    static String[] getP() {
        return new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Static helper method to generate the 'S' character pattern
    static String[] getS() {
        return new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        };
    }

    public static void main(String[] args) {
        String gap = "   ";

        // Retrieve character patterns using helper methods
        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        // Build banner lines by invoking helper methods and using String.join()
        String[] lines = {
            String.join(gap, O[0], O[0], P[0], S[0]),
            String.join(gap, O[1], O[1], P[1], S[1]),
            String.join(gap, O[2], O[2], P[2], S[2]),
            String.join(gap, O[3], O[3], P[3], S[3]),
            String.join(gap, O[4], O[4], P[4], S[4]),
            String.join(gap, O[5], O[5], P[5], S[5]),
            String.join(gap, O[6], O[6], P[6], S[6])
        };

        // Display the banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
