package finals;

public class FinalDemo {
    public static final double E = 2.71;
    public static void main(String[] args) {
        // final property / variable / parameter: Tạo hằng số
        final double pi = 3.14;

        int sum = sum(10, 1);
        System.out.println("sum = " + sum);
        System.out.println("E = " + E);

        // final method: Tạo phương thức không thể bị ghi đè
        // final class: Class mà không có class con

    }

    public static int sum(final int a, final int b) {
        return a + b;
    }
}
