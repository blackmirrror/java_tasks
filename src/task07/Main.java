package task07;

public class Main {

    public static class LinkedIntList {
        private ListNode head;

        public LinkedIntList(ListNode head) {this.head = head;}

        public void removeAll(LinkedIntList list2) {

            ListNode temp1 = new ListNode(0, this.head);
            ListNode temp2 = new ListNode(0, list2.head);

            if (temp1.next == null || temp2.next == null) return;

            while (temp1 != null && temp2 != null && temp1.next != null && temp2.next != null) {
                if (temp1.next.data == temp2.next.data) {
                    if (temp1.next == head) head = temp1.next;
                    temp1.next = temp1.next.next;
                }
                else if (temp1.next.data > temp2.next.data) {
                    temp2 = temp2.next;
                }
                else {
                    temp1 = temp1.next;
                }
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
                                new ListNode(4, null))));
        LinkedIntList list1 = new LinkedIntList(listNode1);

        ListNode listNode2 = new ListNode(2,
                new ListNode(2,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4, null)))));
        LinkedIntList list2 = new LinkedIntList(listNode2);

        list1.removeAll(list2);

        while (list1.head != null) {
            System.out.println(list1.head.data);
            list1.head = list1.head.next;
        }
    }
}
