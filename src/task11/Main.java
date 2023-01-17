package task11;

public class Main {

    public static class LinkedIntList {
        private ListNode head;

        public LinkedIntList(ListNode head) {this.head = head;}

        public void firstLast() {
            if (head == null || head.next == null) return;
            ListNode temp = head;
            head = head.next;
            temp.next = null;

            ListNode temp2 = head;
            while (temp2.next != null) temp2 = temp2.next;
            temp2.next = temp;
        }
    }

    public static class ListNode {
        public int data;
        public ListNode next;

        public ListNode() {}

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1,
                new ListNode(9,
                        new ListNode(3,
                                new ListNode(2,
                                        new ListNode(8, null)))));
        LinkedIntList list1 = new LinkedIntList(listNode1);

        list1.firstLast();

        while (list1.head != null) {
            System.out.println(list1.head.data);
            list1.head = list1.head.next;
        }
    }
}


