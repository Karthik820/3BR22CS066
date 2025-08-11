import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch))
            System.out.println("Toggled: " + Character.toLowerCase(ch));
        else if (Character.isLowerCase(ch))
            System.out.println("Toggled: " + Character.toUpperCase(ch));
        else
            System.out.println("Not an alphabet character");
    }
}
