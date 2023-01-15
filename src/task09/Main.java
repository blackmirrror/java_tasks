package task09;

public class Main {

    public static class LinkedIntList {
        private ListNode head;

        public LinkedIntList(ListNode head) {this.head = head;}

        public void removeDuplicates() {
            if (head == null || head.next == null) return;
            ListNode temp1 = head;
            while (temp1.next != null) {
                ListNode temp2 = temp1;
                while (temp2.next != null) {
                    if (temp2.next.data == temp1.data) {
                        temp2.next = temp2.next.next;
                    }
                    else {
                        temp2 = temp2.next;
                    }
                }
                temp1 = temp1.next;
            }
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
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(4, new ListNode(8,
                                                new ListNode(1,
                                                        new ListNode(5,
                                                                new ListNode(2,
                                                                new ListNode(5,
                                                                        new ListNode(6, null)))))))))));
        LinkedIntList list1 = new LinkedIntList(listNode1);

        list1.removeDuplicates();

        while (list1.head != null) {
            System.out.println(list1.head.data);
            list1.head = list1.head.next;
        }
    }
}

