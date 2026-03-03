// TempFtoC.java
import java.util.Scanner;
public class TempFtoC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        double f = input.nextDouble();
        double c = (f - 32) * 5/9;
        System.out.println("The " + f + " fahrenheit is " + c + " celsius");
    }
}