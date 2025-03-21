package Java_Projects;
import java.util.Scanner;

public class ElectricityBillKRL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of units consumed: ");
        int units = scanner.nextInt();
        double billAmount = 0.0;

        if (units <= 100) {
            billAmount = units * 1.50;
        } else if (units <= 300) {
            billAmount = (100 * 1.50) + ((units - 100) * 2.50);
        } else {
            billAmount = (100 * 1.50) + (200 * 2.50) + ((units - 300) * 3.50);
        }

        System.out.println("Total bill: " + billAmount);

        scanner.close();
    }
}