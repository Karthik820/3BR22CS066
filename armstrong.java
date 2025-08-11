import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number:");
            int n=sc.nextInt();
            int org=n;
            int sum=0;
            int rem=0;
            int temp=n;
            int count=0;
            while(temp>0) {
                temp=temp/10;
                count+=1;
            }
            int res=count;
            while(n!=0) {
                rem=n%10;
                int x=(int)Math.pow(rem, res);
                sum=sum+x;
                n=n/10;
            }
            if(sum==org) {
                System.out.println("it is an armstrong number");
            } else {
                System.out.println("it is not an armstrong number");
            }
        }
    }
