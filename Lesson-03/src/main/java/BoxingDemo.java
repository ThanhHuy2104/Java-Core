public class BoxingDemo {
    public static void main(String[] args) {
        // Boxing: Primitive -> Wrapper Class
        int a = 10;
        Integer b = Integer.valueOf(a);
        System.out.println("b = " + b);

        // Auto Boxing
        Integer c = a;
        System.out.println("c = " + c);

        // Convert chuỗi sang wrapper class
        String s = "12345";
        Integer d = Integer.valueOf(s);
        System.out.println("d + 1 = " + (d + 1));
    }
}
