import java.util.*;

public class MyArrayList<E> implements List<E> {

    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }


    @Override
    public boolean contains(Object o) {
        return false;
    }

    public boolean add(E element) {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = element;
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

}





