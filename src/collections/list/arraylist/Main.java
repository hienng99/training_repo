package collections.list.arraylist;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("bat");
        System.out.println("Size: " + animals.size());
        System.out.println("The initial list: " + animals);
        System.out.println("The element at index = 2: " + animals.get(2));
        animals.set(1, "chicken");
        System.out.println("The list after update element at index 1: " + animals);
        Collections.sort(animals);
        System.out.println("The list after sorting: " + animals);
        animals.remove(2);
        System.out.println("The list after remove element at index 2: " + animals);
        animals.clear();
        System.out.println("The list after clear method is called: " + animals);
    }
}
