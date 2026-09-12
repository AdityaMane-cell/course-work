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

        // creating list {2, 4, 5,7, 10 }
        l.addFirst(7);
        l.addFirst(5);
        l.addFirst(4);
        l.addFirst(2);

        System.out.println(l); // testing toString()
    }

    public void addFirst(int x) {
        // first = new IntNode(x, first); // below broken down into multiple lines
        IntNode temp = new IntNode(x, first);
        first = temp;
    }

    public int getFirst() {
        return first.item;
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
