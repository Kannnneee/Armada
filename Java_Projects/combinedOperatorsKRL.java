package Java_Projects;

public class combinedOperatorsKRL {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        if (a > 0 && b > 0) {
            a+=b;
            b = a * 2;
        }
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
    
}
