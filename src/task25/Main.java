package task25;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(8);
        stack.push(6);
        System.out.println("STACK1");
        while (!stack.empty()) System.out.println(stack.pop());
    }
}
