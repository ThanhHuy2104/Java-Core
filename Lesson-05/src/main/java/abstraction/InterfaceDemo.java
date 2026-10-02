package abstraction;

public class InterfaceDemo {
    public static void main(String[] args) {
        // Interface: Độ trừu tượng =  100%
        // Method: public abstract
        // Property: public static final
        // Từ khóa: implements
        // Có thể triển khai nhiều interface
        Bird bird = new Bird();

        bird.run();
        bird.fly();

    }
}
