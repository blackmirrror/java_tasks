package task18;

public class Main {
    public static class List {
        private int[] list;
        //private int size;

        public List(int[] list) {
            this.list = list;
        }

        public int LSS() {
            if (list.length == 0) {
                return 0;
            }
            int lss = 1;
            int maxlss = 0;
            for (int i = 1; i < list.length; i++) {
                if (list[i - 1] < list[i]) {
                    lss++;
                } else {
                    maxlss = Integer.max(lss, maxlss);
                    lss = 1;
                }
            }
            maxlss = Integer.max(lss, maxlss);
            return maxlss;
        }
    }

    public static void main(String[] args) {
        List list = new List(new int[]{1, 3, 5, 2, 9, 7, -3, 0, 42, 308, 17});
        System.out.println(list.LSS());
    }
}