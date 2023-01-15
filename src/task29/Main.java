package task29;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(6);
        stack.push(3);
        System.out.println("STACK1");
        for (Object i : stack.toArray()) System.out.println(i);
        System.out.println("last element is " + stack.pop());
        System.out.println("STACK1 after pop()");
        for (Object i : stack.toArray()) System.out.println(i);
    }
}
