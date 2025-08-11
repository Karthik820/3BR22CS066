import java.util.Scanner;
public class threelargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int n3 = scanner.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("The largest number is: " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("The largest number is: " + n2);
        } else {
            System.out.println("The largest number is: " + n3);
        }
    }
}
