import java.util.Scanner;

public class vowelconsonantdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isDigit(ch))
            System.out.println("Digit");
        else if ("AEIOUaeiou".indexOf(ch) != -1)
            System.out.println("Vowel");
        else if (Character.isLetter(ch))
            System.out.println("Consonant");
        else
            System.out.println("Other character");
    }
}
