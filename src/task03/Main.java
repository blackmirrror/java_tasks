package task03;

import java.util.*;

public class Main {

    class Solution {
        public static boolean isUnique(Map<String, String> map) {
            Set<String> setKey = map.keySet();
            Collection<String> collectionValue = map.values();
            Set<String> setValue = new HashSet<String>(collectionValue);
            return setKey.size() == setValue.size();
        }
    }

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("One", "one");
        map1.put("Two", "one");
        map1.put("Three", "three");
        System.out.println("Map1 " + (Solution.isUnique(map1) ? "is unique" : "is not unique"));

        Map<String, String> map2 = new HashMap<>();
        map2.put("One", "one");
        map2.put("Two", "two");
        map2.put("Three", "three");
        System.out.println("Map2 " + (Solution.isUnique(map2) ? "is unique" : "is not unique"));
    }
}
