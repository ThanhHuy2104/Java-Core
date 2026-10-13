package statics;

public class StaticDemo {
    public static void main(String[] args) {
        // static: Truy cập thông qua tên class
        // property
        Student.moneyGroup = 100;
        System.out.println("Student.moneyGroup = " + Student.moneyGroup);

        // method
        int sum = Student.sum(1, 10);
        System.out.println("sum = " + sum);
    }

    private static class Math{
        public static double PI = 3.14;
    }
}
