package accessmodifiers;

public class AccessModifierDemo {
    public static void main(String[] args) {
        // Phạm vi truy cập
        // public: Có thể truy cập từ mọi nơi
        Dog dog = new Dog();
        System.out.println("dog.name = " + dog.name);
        // proected: Có tể truy cập trong cùng package hoặc class con
        dog.age = 1;
        // default: Có thể truy cập trong cùng package
        dog.color = "Brown";
        // private: Có thể truy cập trong class đó
        //System.out.println("dog.weight = " + dog.weight);
    }
}
