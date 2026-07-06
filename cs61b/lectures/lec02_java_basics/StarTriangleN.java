package cs61b.lectures.lec02;

/**
 * Prints a right-aligned triangle of stars ('*') with N lines.
 * The first row contains 1 star, the second 2 stars, and so on.
 */

import java.util.Scanner;

public class StarTriangleN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("\nRight aligned trianle of " + n + " lines\n");

        for (int i = 0; i < n; i++) {
            String line = " ".repeat(n - i) + "*".repeat(i);
            System.out.println(line);
        }
    }
}
