import java.util.Objects;

public class ObjectMethodDemo {
    public static void main(String[] args) {
        // toString
        Dog dog = new Dog();
        dog.name = "abc";
        dog.age = 1;
        System.out.println(dog);

        // equals
        Dog dog2 = new Dog();
        dog2.name = "abc";
        dog.age = 2;
        System.out.println(dog.equals(dog2));

        // hashCode
        // 1. Hai đối tượng bằng nhau thì hashCode bằng nhau
        // 2. Hai đói tượng có hashCode bằng nhau thì chưa chắc equals bằng nhau
        System.out.println("dog.hashCode() = " + dog.hashCode());
        System.out.println("dog2.hashCode() = " + dog2.hashCode());
    }
}

class Dog {
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}