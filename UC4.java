/**
 * UC4 - OOPS Banner App (Array & Loops)
 *
 * Stores banner lines in an array and prints them using an enhanced for-loop.
 * Each line is constructed with String.join() to avoid repeated concatenation.
 *
 * Compilation: javac UC4.java
 * Execution:   java UC4
 *
 * @author Developer
 * @version 1.0
 * @since 2026-02-21
 */
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
