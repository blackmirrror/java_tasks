package task05;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    class Solution {
        public static int rarest(Map<String, Integer> map) {
            Map<Integer, Integer> result = new TreeMap<Integer, Integer>();
            Iterator<String> i = map.keySet().iterator();

            while (i.hasNext()) {
                int num = map.get(i.next());
                if (result.containsKey(num))
                    result.put(num, result.get(num) + 1);
                else
                    result.put(num, 1);
            }

            Set<Integer> setKey = result.keySet();
            Iterator<Integer> i1 = setKey.iterator();
            int min = i1.next();
            while(i1.hasNext()) {
                int current = i1.next();
                if (result.get(current) < result.get(min))
                    min = current;
            }
            return min;
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("one", 1);
        map.put("two", 3);
        map.put("three", 3);
        map.put("two", 2);
        System.out.println(Solution.rarest(map));
    }
}
