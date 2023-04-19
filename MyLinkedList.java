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

}
