package task15;

import java.util.*;

public class Main {

    public static class Solution {
        public static void splitStack(Stack<Integer> s) {
            Queue<Integer> q = new LinkedList<Integer>();
            int lessZero = 0;
            while(!s.isEmpty()) {
                if(s.peek() < 0) lessZero++;
                q.add(s.pop());
            }
            while(lessZero > 0) {
                if(q.peek() < 0) {
                    s.push(q.remove());
                    lessZero--;
                } else {
                    q.add(q.remove());
                }
            }
            while(!q.isEmpty())
                s.push(q.remove());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(-1);
        stack.add(1);
        stack.add(8);
        stack.add(10);
        stack.add(-1);
        stack.add(7);
        stack.add(5);
        stack.add(-2);
        stack.add(9);
        stack.add(-5);

        Solution.splitStack(stack);

        while (!stack.isEmpty()) System.out.println(stack.pop());
    }
}
