package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        // Tính trừu tượng
        /* 1 Class là abstract thì nó có thể
        không chứa 1 phương thức abstract nhưng ngược lại thì không*/
        // Abstract không tạo ra đối tượng
        //
        Dog dog = new Dog();
        dog.makeSound();
    }
}
