package task06;

public class Main {

    public static void guavaSort(String [] a) {
        Multiset<String> mset = new Multiset<>();
        for (String s : a) {
            mset.add(s);
        }
        int i = 0; // multiset -> array
        for (String s : mset.elementSet()) {
            int n = mset.count(s);
            while (n > 0) {
                a[i] = s;
                i++;
                n--;
            }
        }
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"a", "c", "e", "d", "e", "a", "b", "e", "d", "e"};
        for (String s : strings) System.out.print(s + " ");
        guavaSort(strings);
        System.out.println();
        for (String s : strings) System.out.print(s + " ");
    }
}
