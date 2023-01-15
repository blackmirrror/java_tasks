package task27;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(1);
        list1.add(6);
        list1.add(3);
        System.out.println("LIST1");
        for (int i = 0; i < list1.size(); i++) System.out.println(list1.get(i));
        System.out.println("size = " + list1.size());
        System.out.println("second element is " + list1.get(1));
        list1.remove(1);
        System.out.println("LIST1 after removing first element");
        for (int i = 0; i < list1.size(); i++) System.out.println(list1.get(i));
    }
}
