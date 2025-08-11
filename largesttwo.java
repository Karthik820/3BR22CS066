import java.util.Scanner;

public class largesttwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int large = (a > b) ? a : b;
        System.out.println("Largest: " + large);
    }
}
