
public class UC4 {
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

        String[] lines = new String[7];
        for (int i = 0; i < 7; i++) {
            lines[i] = String.join(gap, new String[]{O[i], O[i], P[i], S[i]});
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
