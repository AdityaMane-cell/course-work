
public class SelectionSortCustom {
    public static void selectionSort(int[] x) {
        // find smallest
        for(int i=0; i < x.length; i++) {
            int smallest = i;
            for(int j=i; j < x.length; j++) {
                if(x[smallest] > x[j]) {
                    smallest = j;
                }
            }
            // swap the smallest
            swap(x, smallest, i);
        }
        
    }

    // public void selectionSort(String[] x) {

    // }

    public static void swap(int[] x, int a, int b) {
        int temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    public static void print(int[] x) {
        for(int num: x) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        int[] x = {4, 2, 6, 1, 8, 3};
        System.out.println("Original: ");
        print(x);      
        selectionSort(x);
        System.out.println("Sorted: ");
        print(x);      
    }
}

