// TempCtoF.java
import java.util.Scanner;
public class TempCtoF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Celsius: ");
        double c = input.nextDouble();
        double f = (c * 9/5) + 32;
        System.out.println("The " + c + " celsius is " + f + " fahrenheit");
    }
}