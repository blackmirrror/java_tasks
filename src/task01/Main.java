package task01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    class Solution {

        public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
            Iterator<Integer> i1 = list1.iterator();
            Iterator<Integer> i2 = list2.iterator();
            List<Integer> result = new ArrayList<Integer>();

            while(i1.hasNext() || i2.hasNext()) {
                if (i1.hasNext()) result.add(i1.next());
                if (i2.hasNext()) result.add(i2.next());
            }
            return result;
        }
    }

    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(2);
        list1.add(6);
        list1.add(9);

        List<Integer> list2 = new LinkedList<>();
        list2.add(3);
        list2.add(4);
        list2.add(1);
        list2.add(1);

        for (int i : Solution.alternate(list1, list2)) System.out.println(i);
    }
}
