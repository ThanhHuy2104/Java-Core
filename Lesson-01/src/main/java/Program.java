public class Program {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Huỳnh Thanh Huy";
        s1.age = 20;
        System.out.println("s1.name = " + s1.name);
        System.out.println("s1.age = " + s1.age);
        int sum = s1.sum(7, 6);
        System.out.println("sum = " + sum);
        s1.goToSchool();

    }
}
