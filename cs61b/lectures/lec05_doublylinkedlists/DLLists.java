public class DLLists {
    private static class  .IntNode{
        private int item;
        private IntNode prev;
        private IntNode next;
        
        public IntNode(int i, IntNode prevNode, IntNode nextNode) {
            this.item = i;
            this.prev = prevNode;
            this.next = nextNode;
        }
    }
    
    private IntNode sentinel;
    private int size;

    public DLLists(){
        sentinel = new IntNode(99, sentinel, null);
        size = 0;
    }

    public DLLists(int i, IntNode prev, IntNode next) {
        sentinel = new IntNode(99, sentinel, null);
        sentinel.next = new IntNode(i, sentinel.prev, next);
        size++;
    }

    public static void main(String[] args) {

    }

    /* Add at the START of the DLlist */
    /* get the START value */
    /* get the LAST value */
    /* Add at the END of the DLlist */
    /* get SIZE */
    /* search X element & return it's index */
    /* get element based on index  */
}