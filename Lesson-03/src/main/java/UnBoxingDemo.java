public class UnBoxingDemo {
    public static void main(String[] args) {
        // UnBoxing: Wrapper Class -> Primitive
        Integer a = 10;
        double b = a.doubleValue();
        System.out.println("b = " + b);


        // Auto UnBoxing
        int c = a;
        System.out.println("c = " + c);

        // Covert String sang Primitive
        String s = "12345";
        int d = Integer.parseInt(s);
        System.out.println("d = " + (d+2));
    }
}
