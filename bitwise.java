public class bitwise {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Bitwise AND = " + (a & b));
        System.out.println("Bitwise OR = " + (a | b));
        System.out.println("Bitwise xor " + (a ^ b));
        System.out.println("Bitwise NOT" + (~a));
        System.out.println(" Left shift  " + (a << 1));
        System.out.println("Right shift = " + (b >> 1));
    }
}
