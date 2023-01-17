package taskNn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    class Solution {
        public static void reverseHalf(Queue<Integer> q) {
            Stack<Integer> s = new Stack<Integer>();
            int oldSize = q.size();

            for (int i = 0; i < oldSize; i++) {
                if (i % 2 == 0) q.add(q.remove());
                else s.push(q.remove());
            }
            while (!s.isEmpty()) {
                q.add(q.remove());
                q.add(s.pop());
            }
            if (oldSize % 2 == 1) q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);

        for (int i : q) System.out.print(i + " ");
        Solution.reverseHalf(q);
        System.out.println();
        for (int i : q) System.out.print(i + " ");
    }
}
