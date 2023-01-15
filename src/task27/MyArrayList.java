package task27;

public class MyArrayList<E> {
    private int size = 0;
    private int capacity = 0;
    private final int CAPACITY = 16;
    private Object[] array;

    public MyArrayList() {
        capacity = CAPACITY;
        array = new Object[capacity];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
    }

    private void increaseCapacity() {
        capacity = capacity * 2;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
            array[i] = null;
        }
        array = newArray;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public Object[] toArray() {
        Object[] newArray = new Object[size];
        System.arraycopy(array, 0, newArray, 0, size);
        return newArray;
    }

    public boolean add(Object o) {
        if (size >= capacity) increaseCapacity();
        array[size++] = o;
        return true;
    }

    private void shiftToLeft(int start) {
        size--;
        if (size <= 0) return;
        if (size != start) {
            System.arraycopy(array, start + 1, array, start, size - start);
        }
        array[size] = null;
    }

    public boolean remove(Object o) {
        if (size == 0) return false;
        int i;
        for (i = 0; i < size; i++) {
            if (array[i] == null && o == null) break;
            if ((array[i] != null) && (array[i].equals(o))) break;
        }
        if (i < size) {
            shiftToLeft(i);
            return true;
        }
        return false;
    }

    public E get(int index) {
        if ((index < size) && (index >= 0)) {
            return (E) array[index];
        }
        return null;
    }

    public void add(int index, Object element) {
        if (index < 0) return;
        if (size + 1 >= capacity) increaseCapacity();
        if (index > size) index = size;
        for (int i = size; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
    }

    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(array[i])) return i;
            }
        }
        return -1;
    }
}