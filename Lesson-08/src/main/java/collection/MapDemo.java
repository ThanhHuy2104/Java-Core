package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        // Key - Value
        Map<Character, String> map1 = new HashMap<>();
        Map<Character, String> map2 = new LinkedHashMap<>();
        Map<Character, String> map3 = new TreeMap<>();

        map1.put('K', "Khoa");
        map1.put('H', "Huy");
        map1.put('T', "Thư");

        System.out.println("map1.get('H') = " + map1.get('H'));

        System.out.println("map1.keySet() = " + map1.keySet());
        System.out.println("map1.values() = " + map1.values());

        for(Map.Entry<Character, String> pair : map1.entrySet()){
            System.out.printf("Key: %c - Value: %s\n", pair.getKey(), pair.getValue());
        }
    }
}
