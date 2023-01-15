package task26;

public class MyLinkedList<E> {
    class Node{
        E val;
        Node next;
    }
    Node head;
    public MyLinkedList() {
        this.head = null;
    }

    public int size() {
        if (head == null) return 0;
        int c = 1;
        Node temp = this.head;
        while (temp.next != null){
            temp = temp.next;
            c++;
        }
        return c;
    }

    public E get(int index) {
        Node temp = this.head;
        for (int i = 0;i<index;i++) {
            if (temp == null) {
                return null;
            }
            temp = temp.next;
        }
        if (temp == null) return null;
        return temp.val;
    }

    public void addAtHead(E val) {
        Node newNode = new Node();
        newNode.val = val;
        newNode.next = this.head;
        this.head = newNode;
    }

    public void addAtTail(E val) {
        Node newNode = new Node();
        newNode.val = val;

        if (this.head == null){
            newNode.next = this.head;
            this.head = newNode;
        } else {
            Node temp = this.head;
            while (temp.next != null){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void addAtIndex(int index, E val) {
        if (index == 0) {
            addAtHead(val);
        }
        else {
            Node newNode = new Node();
            newNode.val = val;

            Node temp = this.head;
            for (int i = 0; i < index - 1; i++){
                if (temp == null) return;
                temp = temp.next;
            }
            if (temp == null) return;
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void deleteAtIndex(int index) {
        if (this.head == null) return;
        if (index == 0){
            this.head = this.head.next;
            return;
        }
        Node temp = this.head;
        for (int i = 0; i < index - 1; i++){
            if (temp == null){
                return;
            }
            temp = temp.next;
        }
        if (temp == null){
            return;
        }
        if (temp.next != null){
            temp.next = temp.next.next;
        }

    }
}