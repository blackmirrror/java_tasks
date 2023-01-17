package task12;

public class Main {

    public static class LinkedIntList {
        private ListNode head;

        public LinkedIntList(ListNode head) {this.head = head;}

        public void addAtHead(ListNode listNode) {
            listNode.next = head;
            head = listNode;
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
                new ListNode(2, null));
        LinkedIntList list1 = new LinkedIntList(listNode1);

        list1.addAtHead(new ListNode(3, null));

        while (list1.head != null) {
            System.out.println(list1.head.data);
            list1.head = list1.head.next;
        }
    }
}



