package cs61b.lectures.lec07_ArrayList;

/* Invariants:
addLast: The next item we want to add, will go into position size.
getLast: The item we want to return is in position size - 1.
size: The number of items in the list should be size.
*/

public class AList {
    private int[] items;
    private int size;

    // Create an empty list
    public AList() {
        items = new int[100];
        size = 0;
    }

    // insert x into the back of the list
    public void addLast(int x) {
        items[size] = x;
        size++;
    }

    // return the last item of the list
    public int getLast() {
        return items[size - 1];
    }

    // get the i^th item in the list (0 is the front)
    public int get(int i) {
        if (i > size || i < 0) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        return items[i];
    }

    // returns the number of items in the list
    public int size() {
        return size;
    }

    // deletes item from the back of the list and returns deleted item
    public int removeLast() {
        int x = getLast();
        size--;
        // item[size] = 0; // Not really needed as abstraction takes care of this
        return x;
    }

    // prints all the elements of the list
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    // testing functions
    public static void main(String args[]) {
        // testing AList declaration
        AList al = new AList();
        al.addLast(1);
        al.addLast(2);
        al.addLast(3);
        al.addLast(4);
        al.addLast(5);
        al.print();

        // testing getLast()
        System.out.println("Last Element: " + al.getLast());

        // testing get(i)
        System.out.println("Get 3rd Element: " + al.get(3));

        // testing size()
        System.out.println("Get size of the list: " + al.size());

        // testing popLast()
        System.out.println("Remove & display the last element: " + al.removeLast());
        al.print();

    }
}
