# assignment2
The code of "MyArrayList" defines a custom implementation of a dynamic array data structure. The class implements the List interface and provides methods to add and remove elements, check for the presence of an element, get the size of the list, iterate over the elements, and perform other basic operations on a list.

The MyArrayList class uses an underlying array to store the elements, and it resizes the array when necessary to accommodate new elements. The size of the array is doubled when the current size is reached, which makes the resizing operation amortized O(1) time complexity.

The methods are defined in the MyArrayList class:

public boolean add(E element) check index and if index less that 0 or more or equals to size, throw exception. In other ways return the element at the specified index
public boolean contains(Object o) check if an element is present in the list, returns true if the element is present, false otherwise.
public E get(int index) retrieve an element at a specific index in the list,throws an IndexOutOfBoundsException if the index is out of range.
public int size() get the current number of elements in the list.
public boolean remove(Object o) remove an element from the list, not implemented and always returns false.
public Iterator<E> iterator() create an iterator to iterate over the elements in the list.
public E remove(int index) remove an element at a specific index in the list, throws an IndexOutOfBoundsException if the index is out of range, returns the removed element.
public boolean containsAll(Collection<?> c) check if all elements in a collection are present in the list, not implemented and always returns false.
public boolean addAll(Collection<? extends E> c) add all elements in a collection to the end of the list, not implemented and always returns false.
public boolean addAll(int index, Collection<? extends E> c) add all elements in a collection at a specific index in the list, not implemented and always returns false.
public boolean retainAll(Collection<?> c) remove all elements from the list that are not present in a collection, not implemented and always returns false.
public void clear() remove all elements from the list. 
public void add(int index, E element)add an element at a specific index in the list
public int indexOf(Object o) get the index of the first occurrence of an element in the list
public int lastIndexOf(Object o) get the index of the last occurrence of an element in the list
public ListIterator<E> listIterator() create a list iterator to iterate over the elements in the list
public ListIterator<E> listIterator(int index) create a list iterator to iterate over the elements in the list starting from a specific index
public List<E> subList(int fromIndex, int toIndex) get a sublist of elements from the list between two indices
public Object[] toArray() convert the list to an array
public <T> T[] toArray(T[] a) convert the list to an array of a specified type

The code represents an abstract class MyLinkedList that implements the List interface using a doubly linked list data structure. 

The methods are defined in the MyLinkedList class:

add(E element) adds the specified element to the end of the list.

get(int index) returns the element at the specified position in the list.

remove(int index) removes the element at the specified position in the list.

size() returns the number of elements in the list.

isEmpty() returns true if the list contains no elements.

contains(Object obj) returns true if the list contains the specified element.

iterator() returns an iterator over the elements in the list.

The main starts by creating an instance of MyArrayList and adding several integers to it using the add method. 
It then demonstrates various methods of the class, including get, contains, and remove, and prints out the results of calling these methods.


It also shows how to iterate over the elements of the MyArrayList using an iterator and convert it to an array using the toArray method.

The code then creates an instance of MyLinkedList and adds several strings to it using the add method. 
It demonstrates the same methods used with MyArrayList as well as the size, isEmpty, and iterator methods specific to MyLinkedList.


