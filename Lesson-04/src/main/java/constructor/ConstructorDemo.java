package constructor;

import accessmodifiers.Dog;

public class ConstructorDemo {
    public static void main(String[] args) {
        // Hàm khởi tạo
        // 1. Tên trùng với tên của class
        // 2. Không có kiểu dữ liệu trả về
        // Mặc định: 0 tham số

        Student student = new Student("Huy", 20);
        System.out.println(student.toString());

        Dog dog = new Dog();

    }
}
