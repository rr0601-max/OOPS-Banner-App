/**
 * UC3 - OOPS Banner App (String.join refactor)
 *
 * Builds the same 7-line ASCII "OOPS" banner but uses String.join() to
 * create each printed line instead of using the + operator for concatenation.
 *
 * Compilation: javac UC3.java
 * Execution:   java UC3
 *
 * @author Developer
 * @version 1.0
 * @since 2026-02-21
 */
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

        // Use String.join to build each line; keep output identical to UC2.
        for (int i = 0; i < 7; i++) {
            String line = String.join(gap, new String[]{O[i], O[i], P[i], S[i]});
            System.out.println(line);
        }
    }
}
