package lec05_doublylinkedlists;

import java.util.NoSuchElementException;

public class DLList {
    private static class Node{
        private int item;
        private Node prev;
        private Node next;
        
        public Node(int i, Node prevNode, Node nextNode) {
            this.item = i;
            this.prev = prevNode;
            this.next = nextNode;
        }
    }
    
    private Node sentinel;
    private int size;

    public DLList(){
        sentinel = new Node(-1, null, null);
        sentinel.next = sentinel.prev = sentinel;
        size = 0;
    }

    public DLList(int i) {
        /* // issue: constructor code duplication

        sentinel = new Node(-1, null, null);
        Node first = new Node(i, sentinel, sentinel);
        sentinel.next = sentinel.prev = first;
        size+=1;
        */

        this();
        addFirst(i);
    }

    public static void main(String[] args) {
        // System.out.println("---------------------- Testing with empty list --------------------------------------------");
        // // Testing with empty list
        // DLList dl0 = new DLList();
        // System.out.println("Size: " + dl0.size());
        // System.out.println("First: " + dl0.getFirst());
        // System.out.println("Last: " + dl0.getLast());
        // System.out.println(dl0);


        // System.out.println("--------------- Testing with default constructor with addFirst() --------------------------------------------------");
        // // Testing with default constructor with addFirst()
        // DLList dl1 = new DLList();
        // dl1.addFirst(2);
        // dl1.addFirst(3);
        // dl1.addFirst(4);
        // dl1.addFirst(5);

        // System.out.println("DL Size:- " + dl1.size());
        // System.out.println(dl1);
        // System.out.println("First: "+ dl1.getFirst() + "\nLast: "+ dl1.getLast());
        

        // System.out.println("-------------------- Testing with parameterized constructor with addLast() ------------------------------------------------");
        // // Testing with parameterized constructor with addLast()
        // DLList dl2 = new DLList(8);
        // dl2.addFirst(10);
        // dl2.addFirst(14);
        // dl2.addFirst(18);
        // dl2.addFirst(20);

        // System.out.println("Size: " + dl2.size());
        // System.out.println(dl2);
        // System.out.println("First: "+ dl2.getFirst() + "\nLast: "+ dl2.getLast());
        

        // System.out.println("------------------ Testing default constructor with addLast() ------------------------------------------------");
        // // Testing default constructor with addLast() 
        // DLList dl3 = new DLList();
        // dl3.addLast(99);
        // dl3.addLast(88);
        // dl3.addLast(77);
        // dl3.addLast(66);

        // System.out.println("Size: " + dl3.size());
        // System.out.println(dl3);
        // System.out.println("First: "+ dl3.getFirst() + "\nLast: "+ dl3.getLast());
        

        // System.out.println("------------------- Testing default constructor with addLast() ---------------------------------------------");      
        // // Testing default constructor with addLast() 
        // DLList dl4 = new DLList(55);
        // dl4.addLast(44);
        // dl4.addLast(33);
        // dl4.addLast(22);
        // dl4.addLast(11);

        // System.out.println("Size: " + dl4.size());
        // System.out.println(dl4);
        // System.out.println("First: "+ dl4.getFirst() + "\nLast: "+ dl4.getLast());
        

        System.out.println("------------------- Testing indexOf(item) on 0-indexed list ---------------------------------------------");      
        // Testing indexOf() -- 0 indexed list
        DLList dl5 = new DLList(50);
        dl5.addLast(40);
        dl5.addLast(30);
        dl5.addLast(20);
        dl5.addLast(10);

        System.out.println("Size: " + dl5.size());
        System.out.println(dl5);
        System.out.println("Index of [20]: " + dl5.indexOf(20));
        System.out.println("Index of [2]: " + dl5.indexOf(2));
        

        System.out.println("------------------- Testing searchAt(index) on 0-indexed list ---------------------------------------------");      
        // Testing searchAt() -- 0 indexed list
        DLList dl6 = new DLList(100);
        dl6.addLast(90);
        dl6.addLast(80);
        dl6.addLast(70);
        dl6.addLast(60);

        System.out.println("Size: " + dl6.size());
        System.out.println(dl6);
        System.out.println("Element at index '2': " + dl6.searchAt(2));
        System.out.println("Element at index '30': " + dl6.searchAt(30));
    }

    /* Add at the START of the DLlist */
    public void addFirst(int data) {
        /*
        // adding first node in list other than sentinel
        if(sentinel.next == null) {
            Node first = new Node(data, sentinel, sentinel);
            sentinel.next = sentinel.prev = first;
        } else {
            // adding node between sentinel and other node
            Node nextNode = sentinel.next;
            Node first = new Node(data, sentinel, nextNode);
            nextNode.prev = sentinel.next = first;
        }
        */

        // combined approach no special case
        Node nextNode = sentinel.next;
        Node first = new Node(data, sentinel, sentinel.next);
        sentinel.next = nextNode.prev = first;
       
        size++;
    }

    /* get the START value */
    public int getFirst() {
        if(size == 0) {
            throw new java.util.NoSuchElementException("List is Empty!!");
        }
        return sentinel.next.item;
    }

    /* Add at the END of the DLlist */
    public void addLast(int data) {
        Node prevNode = sentinel.prev;
        Node last = new Node(data, prevNode, sentinel);
        prevNode.next = sentinel.prev = last;

        size++;
    }

    /* get the LAST value */
    public int getLast() {
        if(size == 0) {
            throw new java.util.NoSuchElementException("List is Empty!!");
        }
        return sentinel.prev.item;
    }

    /* get SIZE */
    public int size() {
        return size;
    }

    /* search X element & return it's index */
    public int indexOf(int i) {
        int idx = 0;
        Node curr = sentinel.next;
        while(curr != sentinel) {
            if(curr.item == i) {
                return idx;
            }
            curr = curr.next;
            idx++;
        }

        throw new NoSuchElementException("Element not found");
    }

    /* get element based on index  */
    public int searchAt(int i) {
        if(i > size) {
            throw new IndexOutOfBoundsException("Index " + i + " exceeds the size of list.");
        }
        int idx = 0;
        Node curr = sentinel.next;
        while(curr != sentinel) {
            if(idx == i) {
                return curr.item;
            }
            curr = curr.next;
            idx++;
        }

        return -1;
    }

    /* Print list */
    public String toString() {
        Node curr = sentinel.next;
        StringBuilder sb = new StringBuilder("[");
        while(curr != sentinel) {
            sb.append(curr.item);
            if(curr.next != sentinel) sb.append(" -> ");
            curr = curr.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
