package abstraction;

public class Bird extends Pet implements IFly, IRun{
    @Override
    public void makeSound() {
        System.out.println("Líu Lo");
    }

    @Override
    public void run() {
        System.out.println("Bird is running");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
