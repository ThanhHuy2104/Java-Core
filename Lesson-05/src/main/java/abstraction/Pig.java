package abstraction;

public class Pig extends Pet implements IRun{
    @Override
    public void makeSound() {
        System.out.println("Éc éc");
    }

    @Override
    public void run() {
        System.out.println("Pig is running");
    }
}
