import java.util.Scanner;

public class logicaloperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Logical AND " + ((a < b) && (b > 15)));
        System.out.println("Logical OR: " + ((a > b) || (b > 15)));
        System.out.println("Logical NOT: " + !(a < b));
    }
}
