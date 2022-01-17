package collections.list.linkedlist;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);
        numbers.add(2);
        System.out.println("Size: " + numbers.size());
        System.out.println("The initial list: " + numbers.toString());
        System.out.println("The 1st element: " + numbers.getFirst());
        System.out.println("The last element: " + numbers.getLast());
        numbers.addFirst(6);
        System.out.println("The list after add 6 to the beginning: " + numbers.toString());
        numbers.removeLast();
        System.out.println("The list after remove the last item: " + numbers.toString());
    }
}
