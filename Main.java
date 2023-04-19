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
        System.out.println("Does list contain 15? " + myList.contains(15));
        System.out.println("Does list contain 25? " + myList.contains(25));
        System.out.println("Removing element at index 1: " + myList.remove(1));
        System.out.println("Updated list: " + myList);
    }

}
