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

        Student s1 = new Student(1, "A");
        Student s2 = new Student(1, "B");
        Student s3 = new Student(1, "C");

        System.out.println("Student.count = " + Student.count);
    }
    // class
    private static class Math{
        public static double PI = 3.14;
    }
}
