package statics;

public class Student {
    private int id;
    public String name;
    public int age;

    public static int moneyGroup;
    public static int count;

    public Student(int age, String name) {
        this.id = ++count;
        this.age = age;
        this.name = name;
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
