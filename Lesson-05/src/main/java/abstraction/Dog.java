package abstraction;

public class Dog extends Pet implements IRun{
    @Override
    public void makeSound() {
        System.out.println("Ẳng Ẳng");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}
