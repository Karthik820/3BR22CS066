public class binaryadd {
    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
    public static void main(String[] args) {
        int x = 15, y = 27;
        System.out.println("Sum = " + add(x, y));
    }

}
