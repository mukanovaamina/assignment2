import java.util.*;

public abstract class MyLinkedList<E> implements List<E> {
private Node<E> head;
private Node<E> tail;
private int size;

private static class Node<E> {
    E element;
    Node<E> next;
    Node<E> prev;

    public Node(E element, Node<E> next, Node<E> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

}
    public boolean add(E element) {
        Node<E> newNode = new Node<>(element, null, tail);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        if (index < size / 2) {
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current.element;
    }


    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        if (index == 0) {
            head = head.next;
        } else if (index == size - 1) {
            current = tail;
            tail = tail.prev;
            tail.next = null;
        } else {
            if (index < size / 2) {
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
            } else {
                current = tail;
                for (int i = size - 1; i > index; i--) {
                    current = current.prev;
                }
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
        return current.element;
    }

    public boolean deleteDuplicate(int index) {
        if (head == null || index < 0) {
            return false;
        }
        Node<E> current = head;
        int i = 0;
        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }
        if (current == null || current.next == null) {
            return false;
        }
        Node<E> nextNode = current.next;
        if (nextNode.equals(current.next)) {
            current.next = nextNode.next;
            return true;
        }
        return false;
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object obj) {
        Node<E> current = head;
        while (current != null) {
            if (obj.equals(current.element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = head;

            public boolean hasNext() {
                return current != null;
            }

            public E next() {
                E element = current.element;
                current = current.next;
                return element;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }


}
