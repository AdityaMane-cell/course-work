public class SLList {

    private static class IntNode {
        private int item;
        private IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /* sentinel reference always points to sentinel node
    first item if it exists is always at sentinel.next */
    private IntNode sentinel;
    private int size;

    public SLList() {
        sentinel = new IntNode(63, null);
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size++;
    }

    public static void main(String[] args) {
        SLList l = new SLList(10);

        // creating list {3, 5,7, 10 }
        l.addFirst(7);
        l.addFirst(5);
        l.addFirst(3);

        System.out.println(l); // testing addfirst() & toString()
        System.out.println("Size: " + l.size()); // testing size()

        SLList l2 = new SLList(20);
        l2.addLast(30);
        l2.addLast(40);
        l2.addLast(50);
        l2.addLast(60);

        System.out.println(l2); // testing addlast()
        System.out.println("Size: " + l2.size());

        /* NullPointerException Error.
        It occurs when SLList is intantialized with SLList() instead of SLList(x)
        mechanism failure: When addLast() is invoked on the null list it tries to access the next feild of null which doesn't exist.
        solution: 
        Approach 1 -> add null check in addLast method and if List is null then invoke addFirst method internally
        Approach 2 -> use sentinel node which is actually vastly superior to the approach 1.
            sentinel node eliminates the need for these special cases.
            which make the code clear, bug resistent & easier to upgrade (eg. convert to doubly linkedlist approach1 would result in lots of errors)*/
        SLList l3 = new SLList();
        l3.addLast(11);
        System.out.println("Solving the error: " + l3); // testing


    }

    // add x in front of the list
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size++;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    public void addLast(int x) {
        IntNode temp = sentinel;
        
        /*
         * approach 1
         * if(temp == null) {
         * addFirst(x);
         * return;
         * }
         */ 

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new IntNode(x, null);
        size++;
    }

    // faster and computationally cheaper method
    public int size() {
        return size;
    }

    // // helper for size
    // public static int size(IntNode p) {
    //     if (p.next == null) {
    //         return 1;
    //     }
    //     return 1 + size(p.next);
    // }
    // public int size() {
    //     return size(first);
    // }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        IntNode temp = sentinel.next;
        while (temp != null) {
            sb.append(temp.item);
            if (temp.next != null)
                sb.append(" -> ");
            temp = temp.next;
        }
        sb.append("]");

        return sb.toString();
    }

}
