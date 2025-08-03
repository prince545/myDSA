package Strings;

import java.util.HashMap;
import java.util.Map;

public class freq {
    public static void main(String[] args) {
        String s = "tree";

        // count frequency using a map
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println("Frequencies:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
