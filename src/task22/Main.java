package task22;

import java.util.Arrays;

public class Main {
    class Solution<E> {
        public static <E extends Comparable<E>> void sort(E[] array) {
                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = 0; j < array.length - i - 1; ++j) {
                        if (array[i].compareTo(array[i + 1]) > 0) {
                            E tmp = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = tmp;
                        }
                    }
                }
                System.out.println(Arrays.toString(array));
            }
    }

    public static void main(String[] args) {
            String[] a = {"qwe", "asd", "adfc"};
            Solution.sort(a);
    }
}
