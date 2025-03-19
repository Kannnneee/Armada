package Java_Projects;

public class assignmentOperatorsKRL {
    public static void main(String[] args) {
        int x = 10;

        x += 5; 
        System.out.println("After x += 5: " + x);

        x -= 3; 
        System.out.println("After x -= 3: " + x);

        x *= 2; 
        System.out.println("After x *= 2: " + x);

        x /= 4;
        System.out.println("After x /= 4: " + x);

        x %= 3;
        System.out.println("After x %= 3: " + x);

        double initialPrice = 100;
        
        initialPrice *= 0.8;
        System.out.println("After 20% discount: " + initialPrice);

        initialPrice *= 1.1;
        System.err.println("After 10% tax: " + initialPrice);
    }
}
