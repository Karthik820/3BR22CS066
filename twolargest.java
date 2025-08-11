import java.util.Scanner;

public class twolargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Largest number is: " + a);
        } else {
            System.out.println("Largest number is: " + b);
        }
    }
}
