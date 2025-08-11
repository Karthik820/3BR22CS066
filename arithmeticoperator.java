import java.util.Scanner;

public class arithmeticoperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("For Addition: " + (a + b));
        System.out.println("For Subtraction: " + (a - b));
        System.out.println("For Multiplication: " + (a * b));
        System.out.println("For Division: " + (a / b));
        System.out.println("For Modulus: " + (a % b));
    }
}