import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        int temp=n;
        int rem=0;
        int rev=0;
        while(n!=0) {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev) {
            System.out.println("it is a palindrome");
        } else {
            System.out.println("it is not a palindrome");
        }
    }
}