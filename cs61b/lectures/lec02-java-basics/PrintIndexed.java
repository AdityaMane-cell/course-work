package cs61b.lectures.lec02;

/**
 * Prints each character of a given string followed by the reverse of its index.
 * Example: printIndexed("hello") -> h4e3l2l1o0
 */

public class PrintIndexed {
    public static String indexed(String input) {
        int n = input.length();
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < n) {
            sb.append(input.charAt(i)).append(n - i - 1);
            i++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Indexed String: " + indexed(input));
    }
}
