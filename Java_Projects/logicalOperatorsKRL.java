package Java_Projects;

public class logicalOperatorsKRL {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a&&b));
        System.out.println("a || b: " + (a||b));
        System.out.println("!a: " + !a);
        System.out.println("!b: " + !b);

        int creditscore = 720;
        int income = 100000;

        if(creditscore > 700 || income > 50000){
            System.out.println("You are eligible for the loan");
        }else{
            System.out.println("You are not eligible for the loan");
        }

    }
}
