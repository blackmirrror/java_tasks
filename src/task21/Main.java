package task21;

public class Main {

    static class Solution<E> {


        public int linearSearch(Comparable<E>[] array, E num) {
            for (int i = 0; i < array.length; ++i){
                if (array[i].compareTo(num) == 0) return i;
            }
            return -1;
        }

        public int binarySearch(Comparable<E>[] array, E num, int low, int high) {
            int middle = low + (high - low) / 2;
            if (high < low) return -1;

            if (array[middle].compareTo(num) == 0)
                return middle;
            else if (array[middle].compareTo(num) > 0)
                return binarySearch(array, num, low, middle - 1);
            else
                return binarySearch(array, num, middle + 1, high);
        }
    }

    public static void main(String[] args) {
        String[] array1 = {"123", "32", "asdad"};
        Solution<String> solution = new Solution<>();
        System.out.println(solution.binarySearch(array1, "asdad", 0, array1.length));
    }
}