package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Dog> set1 = new HashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        Set<Integer> set3 = new TreeSet<>();

        set1.add(new Dog("Lucky", 1));
        set1.add(new Dog("Mimi", 2));
        set1.add(new Dog("Lucky", 1));

        System.out.println("set1 = " + set1);

    }
}
