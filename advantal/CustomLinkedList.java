package advantal;
import java.util.AbstractList;

public class CustomLinkedList<E> extends AbstractList<E> {
    
    // Node class representing each element in the linked list
    private class Node {
        E data;
        Node next;
        
        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Head of the linked list
    private Node head;
    // Size of the linked list
    private int size;
    
    // Constructor
    public CustomLinkedList() {
        head = null;
        size = 0;
    }
    
    // Add an element to the end of the list
    @Override
    public boolean add(E element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        return true;
    }
    
    // Get the element at the specified index
    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    
    // Return the size of the list
    @Override
    public int size() {
        return size;
    }

    // Remove the element at the specified index
    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node current = head;
        if (index == 0) {
            head = head.next;
        } else {
            Node previous = null;
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }
            previous.next = current.next;
        }
        size--;
        return current.data;
    }

    // Set the element at the specified index
    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        E oldData = current.data;
        current.data = element;
        return oldData;
    }
}
