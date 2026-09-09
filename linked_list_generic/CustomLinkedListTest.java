package java_core.data_structure;

import java.util.List;

public class CustomLinkedListTest {
        public static void main(String[] args) {
        CustomLinkedList<Integer> l1 = new CustomLinkedList<>(2, 3, 4, 5, 6, 7);
        System.out.println(l1);

        CustomLinkedList<String> l2 = new CustomLinkedList<>(List.of("apple", "mango", "pineapple", "orange", "papaya"));
        l2.add("banana");
        System.out.println(l2);
    }
}