package Java_Projects;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bmi;
        double weight;
        double height;

        System.out.print("Enter your weight (kg): ");
        weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter your height (m): ");
        height = scanner.nextDouble();
        scanner.nextLine();

        bmi = weight / (height * height);

        String healthStatus = (bmi < 18.5) ? "Underweight" :
                              (bmi >= 18.5 && bmi < 24.9) ? "Normal" :
                              (bmi >= 25 && bmi < 29.9) ? "Overweight" : "Obese";

        System.out.println("\n===BMI Report===");
        System.out.printf("Your BMI: %.2f\n", bmi);
        System.out.println("Health Status: " + healthStatus);

        scanner.close();
    }
}