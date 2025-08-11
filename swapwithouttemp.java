public class swapwithouttemp {
    public static void main(String[] args) {
        int a = 55;
        int b = 40;
        System.out.println("Before Swapping:");
        System.out.println("a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
