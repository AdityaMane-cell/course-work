/*
Improvements:
1. Generics implementation
2. Ascending and Descending selection sort based choice based on choice.
*/

public class SelectionSortCustom {
    // selection sort for int
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

    // selection sort for string
    public static void selectionSort(String[] x) {
        // find smallest
        for(int i=0; i < x.length; i++) {
            int smallest = i;
            for(int j=i; j < x.length; j++) {
                if(x[smallest].compareTo(x[j]) >= 0) {
                    smallest = j;
                }
            }
            // swap the smallest
            swap(x, smallest, i);
        }
    }

    // swap for int
    public static void swap(int[] x, int a, int b) {
        int temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    // swap for string
    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
    
    // helper functions
    public static void print(int[] x) {
        for(int num: x) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void print(String[] x) {
        for(String word: x) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        // Integer sort
        int[] nums = {4, 2, 6, 1, 8, 3};
        System.out.println("Original: ");
        print(nums);      
        selectionSort(nums);
        System.out.println("Sorted: ");
        print(nums);
        
        // String sort
        String[] words = {"World", "Hello", "Alpha", "Omega", "Zeta", "Pi"};
        System.out.println("Original: ");
        print(words);      
        selectionSort(words);
        System.out.println("Sorted: ");
        print(words);      
    }
}

