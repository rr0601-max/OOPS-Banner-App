public class UC5 {
    public static void main(String[] args) {
        String gap = "   ";

        // declare and initialize lines in a single statement using String.join()
        String[] lines = {
            String.join(gap, " ***** ", " ***** ", "****** ", " ***** "),
            String.join(gap, "*     *", "*     *", "*     *", "*     *"),
            String.join(gap, "*     *", "*     *", "*     *", "*      "),
            String.join(gap, "*     *", "*     *", "****** ", " ***** "),
            String.join(gap, "*     *", "*     *", "*      ", "      *"),
            String.join(gap, "*     *", "*     *", "*      ", "*     *"),
            String.join(gap, " ***** ", " ***** ", "*      ", " ***** ")
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}