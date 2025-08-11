import java.util.*;
public class vowelorconstant {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            if ("AEIOUaeiou".indexOf(ch) != -1)
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        } else {
            System.out.println("Not a letter");
        }
    }



}