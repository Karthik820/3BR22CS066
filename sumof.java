import java.util.*;

class primecheck
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

public class sumof {

    public static void main(String[] args) {
        primecheck cp=new primecheck();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();

        int evenSum=0;
        int oddSum=0;
        int primeSum=0;
        int rem=0;
        int rev=0;

        while(n!=0)
        {
            rem=n%10;
            if(cp.checkprime(rem)) {
                primeSum+=rem;
            }
            if(rem%2==0)
            {
                evenSum+=rem;
            }
            else
            {
                oddSum+=rem;
            }
            n=n/10;
        }
        System.out.println("sum of even numbers: "+ evenSum);
        System.out.println("sum of odd numbers: "+ oddSum);
        System.out.println("sum of prime numbers: "+ primeSum);
    }

}
