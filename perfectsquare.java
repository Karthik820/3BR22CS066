import java.util.Scanner;
public class perfectsquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int sqrt = (int)Math.sqrt(num);

        if (sqrt * sqrt == num)
        {
            System.out.println(num + " is a perfect square.");
        }
        else {
            System.out.println(num + " is not a perfect square.");}
    }



}
