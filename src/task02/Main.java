package task02;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public class Solution {
        public static Map<String, Integer> reverse(Map<Integer, String> input) {
            Map<String, Integer> res = new HashMap<>();
            input.forEach((k, v) -> res.put(v, k));
            return res;
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> input = new HashMap<>();
        input.put(1, "str");
        input.put(2, "str");
        input.put(3, "str1");
        input.put(4, "str2");
        input.put(5, "str3");
        input.put(6, "str3");
        input.put(7, "str3");
        Solution.reverse(input).forEach((k,v) -> System.out.println("key: " + k + "; value:" + v));
    }
}




