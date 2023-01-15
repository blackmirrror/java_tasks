package task14;

import java.util.Objects;
import java.util.Stack;

public class Main {

    public static class Solution {
        public static boolean myEquals(Stack<Integer> stack1, Stack<Integer> stack2) {
            Stack<Integer> temp = new Stack<>();
            while ((!stack1.isEmpty()) && (!stack2.isEmpty())) {
                int value1 = stack1.pop();
                int value2 = stack2.pop();
                if (value1 == value2) temp.add(value1);
                else {
                    stack1.add(value1);
                    stack2.add(value2);
                    while (!temp.isEmpty()) {
                        int val = temp.pop();
                        stack1.add(val);
                        stack2.add(val);
                    }
                    return false;
                }
            }
            while (!temp.isEmpty()) {
                int val = temp.pop();
                stack1.add(val);
                stack2.add(val);
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.add(1);
        stack1.add(2);
        stack1.add(3);

        Stack<Integer> stack2 = new Stack<>();
        stack2.add(1);
        stack2.add(2);
        stack2.add(3);

        Stack<Integer> stack3 = new Stack<>();
        stack3.add(1);
        stack3.add(2);

        System.out.println("S1 and S2 are " + (Solution.myEquals(stack1, stack2) ? "equals" : "not equals"));
        System.out.println("S1 and S3 are " + (Solution.myEquals(stack1, stack3) ? "equals" : "not equals"));
    }
}
