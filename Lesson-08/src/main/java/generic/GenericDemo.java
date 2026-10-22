package generic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        // Generic: Lập trình tổng quát
        // T: Type
        // E: Element
        // N: Number
        // K: Key
        // V: Value

        // Generic Method
        printAny(LocalDate.now());

        // Generic Class
        Circle<Integer> c1 = new Circle<>(1, "Red");
        System.out.println(c1);

        Circle<Double> c2 = new Circle<>(2.1, "Blue");
        System.out.println("c2 = " + c2);

        // Wild Card
        // T extends Number: T là con của Number
        // N extends Number & Comparable<N>: N là con của Number và Comparable
        int max = max(1, 100);
        System.out.println("max = " + max);
        // ? super E: list<?> là bố của list<E>
        // ? extends E: list<?> là con của list<E>
        List<Number> listNumber = new ArrayList<>();
        List<Integer> listInteger = new ArrayList<>(Arrays.asList(1,2,3));

        add(listInteger, listNumber);
        Circle<Double> c3 = new Circle<>(9.5, "Black");
        System.out.println("c3 = " + c3);

        // ?: Không quan tâm kiểu dữ liệu gì
        printSize(listNumber);
    }
    public static void printSize(List<?> list) {
        System.out.println("list.size() = " + list.size());
    }

    public static <N> void add(List<? extends N> from, List<N> to) {
        for (N element : from) {
            to.add(element);
        }
    }
    public static <N extends Number & Comparable<N>> N max(N a, N b) {
        return a.compareTo(b) > 0 ? a : b;
    }
    public static <T> void printAny(T a) {
        System.out.println(a);
    }
}
