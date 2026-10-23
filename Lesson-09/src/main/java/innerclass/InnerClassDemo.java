package innerclass;

public class InnerClassDemo {
    public static void main(String[] args) {
        // Có đầy đủ tính chất của class
        // 1. Có thể private, protected
        Car car = new Car("Vinfast", "Black");
        Car.Engine engine = car.new Engine(4);
        System.out.println("car = " + car);
        System.out.println("engine = " + engine);
        // 2. Có thể là static class
        Car.Price price = new Car.Price(4000);
        System.out.println("price = " + price);

        // 3. Class nằm trong method
        class Dog {
            private String name;
            private int age;

            public Dog(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Dog{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }

        Dog dog = new Dog("A", 10);
        System.out.println("dog = " + dog);
    }
}
