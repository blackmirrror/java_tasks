package task08;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    class Solution {
        public static void mystery(Map<String, String> map) {
            Map<String, String> result = new TreeMap<>();
            for (String key : map.keySet()) {
                if (key.compareTo(map.get(key)) < 0)
                    result.put(key, map.get(key));
                else
                    result.put(map.get(key), key);
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("two", "deux");
        map1.put("five", "cinq");
        map1.put("one", "un");
        map1.put("three", "trois");
        map1.put("four", "quatre");
        Solution.mystery(map1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("skate", "board");
        map2.put("drive", "car");
        map2.put("program", "computer");
        map2.put("play", "computer");
        Solution.mystery(map2);
    }
}
