package task26;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(8);
        list.add(4);
        list.add(1);
        list.add(5);
        System.out.println("LIST:");
        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));
        list.remove(1);
        System.out.println("LIST after removing first element:");
        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));
    }
}
