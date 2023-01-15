package task26;

import java.util.List;

public class MyArrayList<E> {
    MyLinkedList<E> myLinkedList;

    public MyArrayList() {
        myLinkedList = new MyLinkedList<>();
    }

    public int size() {
        return myLinkedList.size();
    }

    public void add(E elem) {
        myLinkedList.addAtTail(elem);
    }

    public void add(int index, E elem) {
        myLinkedList.addAtIndex(index, elem);
    }

    public void remove(int index) {
        myLinkedList.deleteAtIndex(index);
    }

    public E get(int index) {
        return myLinkedList.get(index);
    }
}
