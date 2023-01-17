package task16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    class Solution {
        public static Stack<Integer> copyStack(Stack<Integer> s) {
            Stack<Integer> copy = new Stack<Integer>();
            Queue<Integer> q = new LinkedList<Integer>();

            while (!s.isEmpty()) copy.push(s.pop());
            while (!copy.isEmpty()) {
                int num = copy.pop();
                q.add(num);
                s.push(num);
            }
            while (!q.isEmpty()) copy.push(q.remove());
            return copy;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(6);
        stack.add(4);
        for (int i : stack) System.out.print(i + " ");
        Stack<Integer> newStack = Solution.copyStack(stack);
        System.out.println();
        for (int i : newStack) System.out.print(i + " ");
    }
}
