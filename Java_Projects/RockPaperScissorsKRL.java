package Java_Projects;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsKRL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String userChoice = "";
        String computerChoice = "";
        String result = "";

        System.out.print("Enter your choice (R, P, S): ");
        userChoice = scanner.nextLine();

        int computerChoiceNumber = random.nextInt(3);
        switch (computerChoiceNumber) {
            case 0:
                computerChoice = "R";
                break;
            case 1:
                computerChoice = "P";
                break;
            case 2:
                computerChoice = "S";
                break;
        }

        System.out.println("Computer chose: " + computerChoice);

        switch (userChoice) {
            case "R":
                switch (computerChoice) {
                    case "R":
                        result = "It's a tie!";
                        break;
                    case "P":
                        result = "You lose!";
                        break;
                    case "S":
                        result = "You win!";
                        break;
                }
                break;
            case "P":
                switch (computerChoice) {
                    case "R":
                        result = "You win!";
                        break;
                    case "P":
                        result = "It's a tie!";
                        break;
                    case "S":
                        result = "You lose!";
                        break;
                }
                break;
            case "S":
                switch (computerChoice) {
                    case "R":
                        result = "You lose!";
                        break;
                    case "P":
                        result = "You win!";
                        break;
                    case "S":
                        result = "It's a tie!";
                        break;
                }
                break;
            default:
                result = "Invalid choice. Please enter R, P, or S.";
                break;
        }

        System.out.println(result);

        scanner.close();
    }
}