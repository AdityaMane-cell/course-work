package cs61b.lectures.lec02;

/**
 * Returns a new string where each character of the given string is repeated
 * twice.
 * Example: doubleUp("hello") -> "hheelllloo"
 */

public class DoubleUp {
    public static String doubleChar(String input) {
        int n = input.length();
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            sb.append(c).append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Doubled Up String: " + doubleChar("hello"));
    }
}
