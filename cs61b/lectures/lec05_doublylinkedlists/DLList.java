package lec05_doublylinkedlists;

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

    public DLList(int i, Node prev, Node next) {
        sentinel = new Node(-1, null, null);
        Node first = new Node(i, sentinel, sentinel);
        sentinel.next = sentinel.prev = first;
        size+=1;
    }

    public static void main(String[] args) {
        DLList dl = new DLList();
        dl.addFirst(2);
        dl.addFirst(3);
        dl.addFirst(4);
        dl.addFirst(5);

        System.out.println("DL Size:- " + dl.size());
        System.out.println(dl);

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
        return sentinel.next.item;
    }

    /* Add at the END of the DLlist */
    public void addLast(int data) {
        ///-----------------------------------------------------------------------------------------------------
    }
    /* get the LAST value */
    public int getLast() {
        return sentinel.prev.item;
    }

    /* get SIZE */
    public int size() {
        return size;
    }

    /* search X element & return it's index */
    /* get element based on index  */

    /* Print list */
    public String toString() {
        Node curr = sentinel.next;
        StringBuilder sb = new StringBuilder("[");
        while(curr != sentinel) {
            if (curr.next == sentinel) {
                sb.append(curr.item);
                break;
            }
            sb.append(curr.item).append(" -> ");
            curr = curr.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
