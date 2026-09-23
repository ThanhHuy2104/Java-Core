public class DataTypeCastingDemo {
    public static void main(String[] args) {
        // Widening: byte -> short -> int -> long -> float -> double
        int a = 10;
        long b = a;
        System.out.println("b = " + b);

        // Narrowing: double -> float -> long -> int -> short -> byte
        // -128 -> 127 -> -128
        int c = 128;
        byte d = (byte)c;
        System.out.println("d = " + d);
    }
}
