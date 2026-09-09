package java_core.data_structure;

import java.util.List;

public class CustomLinkedList<T> {
    // make the node class private static -- why? => because for each linked list obj will have its own instance of nodes as well which creates uneccesary overhead.
    private static class Node<E>{
        E data;
        Node<E> next;
        
        public Node() {}

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
        
        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public CustomLinkedList() {}

    public CustomLinkedList(T element) {
        add(element);
    }

    // constructor which expects a sequence of numbers
    @SafeVarargs
    public CustomLinkedList(T... elements) {
        for(T element : elements) {
            add(element);
        }
    }

    //another constructor which expect input as list
    // Change List<T> to Iterable<? extends T> then what will change and 
    public CustomLinkedList(List<T> elements) {
        for(T element : elements) {
            add(element);
        }
    }

    public void add(T element) {
        Node<T> currNode = new Node<>(element);
        if(head == null) {
            head = currNode;
            tail = currNode;
        } else {
            tail.next = currNode;
            tail = currNode;
        }
        size++;
    }

    // public T get(int index) {}

    public T getFirst() {
        return (head != null) ? this.head.data : null;
    }

    public T getLast() {
        return (tail != null) ? this.tail.data : null;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder("[");
        Node<T> curr = head;
        while(curr != null) {
            list.append(curr.data);
            if(curr.next != null){
                list.append(", ");
            }
            curr = curr.next;
        }
        list.append("]");
        return list.toString();
    }

}