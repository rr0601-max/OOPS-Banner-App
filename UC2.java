/**
 * UC2 - OOPS Banner App (ASCII Art)
 *
 * Prints the word "OOPS" as a 7-line ASCII banner using only individual
 * System.out.println() statements per line as required by the use case.
 *
 * Compilation: javac UC2.java
 * Execution:   java UC2
 *
 * @author Developer
 * @version 1.0
 * @since 2026-02-21
 */
public class UC2 {
    public static void main(String[] args) {
        String o0 = " ***** ";
        String o1 = "*     *";
        String o2 = "*     *";
        String o3 = "*     *";
        String o4 = "*     *";
        String o5 = "*     *";
        String o6 = " ***** ";

        String p0 = "****** ";
        String p1 = "*     *";
        String p2 = "*     *";
        String p3 = "****** ";
        String p4 = "*      ";
        String p5 = "*      ";
        String p6 = "*      ";

        String s0 = " ***** ";
        String s1 = "*     *";
        String s2 = "*      ";
        String s3 = " ***** ";
        String s4 = "      *";
        String s5 = "*     *";
        String s6 = " ***** ";

        String gap = "   ";

        System.out.println(o0 + gap + o0 + gap + p0 + gap + s0);
        System.out.println(o1 + gap + o1 + gap + p1 + gap + s1);
        System.out.println(o2 + gap + o2 + gap + p2 + gap + s2);
        System.out.println(o3 + gap + o3 + gap + p3 + gap + s3);
        System.out.println(o4 + gap + o4 + gap + p4 + gap + s4);
        System.out.println(o5 + gap + o5 + gap + p5 + gap + s5);
        System.out.println(o6 + gap + o6 + gap + p6 + gap + s6);
    }
}
