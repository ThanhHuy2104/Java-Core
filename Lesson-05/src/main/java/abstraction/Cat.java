package abstraction;

public class Cat extends Pet implements IRun{
    @Override
    public void makeSound() {
        System.out.println("Meo meo");
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }
}
