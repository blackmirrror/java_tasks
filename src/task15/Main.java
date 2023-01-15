package task15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Stack;

public class Main {

    public static class Solution {
        public static void splitStack(Stack<Integer> stack) {
            Stack<Integer> plus = new Stack<>();
            Stack<Integer> minus = new Stack<>();
            while (!stack.isEmpty()) {
                int val = stack.pop();
                if (val < 0) plus.add(val);
                else minus.add(val);
            }
            while (!minus.isEmpty()) stack.add(minus.pop());
            while (!plus.isEmpty()) stack.add(plus.pop());
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
