package task04;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public class Solution {
        public static boolean hasOdd(Set<Integer> input) {
            for (int i : input) {
                if (i % 2 != 0) return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Set<Integer> input1 = new HashSet<Integer>();

        Set<Integer> input2 = new HashSet<Integer>();
        input2.add(2);
        input2.add(4);

        Set<Integer> input3 = new HashSet<Integer>();
        input3.add(1);
        input3.add(2);
        input3.add(3);
        input3.add(4);
        input3.add(5);

        System.out.println("input1: " + Solution.hasOdd(input1));
        System.out.println("input2: " + Solution.hasOdd(input2));
        System.out.println("input3: " + Solution.hasOdd(input3));
    }
}
