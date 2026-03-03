// Income.java
import java.util.Scanner;
public class Income {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Salary: ");
        double salary = input.nextDouble();
        System.out.print("Bonus: ");
        double bonus = input.nextDouble();

        double total = salary + bonus;
        System.out.println("The salary is INR " + salary +
                           " and bonus is INR " + bonus +
                           ". Hence Total Income is INR " + total);
    }
}