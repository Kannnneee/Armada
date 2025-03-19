package Java_Projects;

public class relationalOperatorsKRL {
    public static void main(String[] args) {
        int x = 30;
        int y = 80;

        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        if (x >= 40 && x <= 80) {
            System.out.println("x is within the range 40 to 80");
        } else {
            System.out.println("x is NOT within the range 40 to 80");
        }
    }
}