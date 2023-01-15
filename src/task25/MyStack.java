package task25;

import java.util.ArrayList;

public class MyStack<E> {

    private ArrayList<E> list;
    private int size;

    public boolean empty() {
        return size == 0;
    }

    public MyStack() {
        this.list =  new ArrayList<>();
        this.size = 0;
    }

    public void push(E a){
        list.add(size, a);
        size++;
    }
    public E pop(){
        if(size==0) return null;
        return(list.get(size-1));
    }
}

