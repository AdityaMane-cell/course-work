public class SLList {

    private static class IntNode {
        private int item;
        private IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first;

    public SLList(int x) {
        first = new IntNode(x, null);
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

    }

    public void addFirst(int x) {
        // first = new IntNode(x, first); // below broken down into multiple lines
        IntNode temp = new IntNode(x, first);
        first = temp;
    }

    public int getFirst() {
        return first.item;
    }

    public void addLast(int x) {
        IntNode temp = first;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new IntNode(x, null);
    }

    // helper for size
    public static int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return 1 + size(p.next);
    }

    public int size() {
        return size(first);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        IntNode temp = first;
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
