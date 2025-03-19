package Java_Projects;

public class modulusOperatorKRL {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 2;

        int remainder = num1 % num2;
        System.out.println("The remainder of " + num1 + " when divided by " + num2 + " is: " + remainder);

        if (num1 % num2 == 0) {
            System.out.println(num1 + " is divisible by " + num2);
        } else {
            System.out.println(num1 + " is NOT divisible by " + num2);
        } 
    }
}