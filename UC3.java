
public class UC3 {
    public static void main(String[] args) {
        String[] O = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };

        String[] P = {
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };

        String[] S = {
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        };

        String gap = "   ";

        // Use String.join to build each line; keeping output identical to UC2.
        for (int i = 0; i < 7; i++) {
            String line = String.join(gap, new String[]{O[i], O[i], P[i], S[i]});
            System.out.println(line);
        }
    }
}
