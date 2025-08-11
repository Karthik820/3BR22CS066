import java.util.Scanner;

class primechecker
{
    public boolean checkprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}

public class evenoddprime {

    public static void main(String[] args) {
        primechecker cp=new primechecker();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();

        int counteven=0;
        int countodd=0;
        int countprime=0;
        int rem=0;

        while(n!=0)
        {
            rem=n%10;
            if(cp.checkprime(rem)) {
                countprime+=1;
            }
            rem=n%10;
            if(rem%2==0)
            {
                counteven+=1;
            }
            else
            {
                countodd+=1;
            }
            n=n/10;
        }
        System.out.println("count of even numbers: "+ counteven);
        System.out.println("count of odd numbers: "+ countodd);
        System.out.println("count of prime numbers: "+ countprime);
    }

}
