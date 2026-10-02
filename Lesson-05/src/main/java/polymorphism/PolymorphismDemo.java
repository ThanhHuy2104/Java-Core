package polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Widening: Student -> Person
        Person student = new Student("Huy", 24120323);
        student.sleep();
        // Chỉ truy cập được phương thức của class cha
        // Đối tượng đó được tạo từ class nào thì thực hiện phương thức theo class đó

        // Toán tử: instanceof
        boolean isStudent = student instanceof Student;
        System.out.println("isStudent = " + isStudent);
    }
}
