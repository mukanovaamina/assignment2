import java.util.*;
public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<Integer>();
        myList.add(5);
        myList.add(10);
        myList.add(15);
        myList.add(20);
        System.out.println("Original list: " + myList);
        System.out.println("Element at index 2: " + myList.get(2));
    }

}