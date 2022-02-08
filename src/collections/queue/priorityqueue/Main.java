package collections.queue.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);

        out.println(numbers);
//        out.println(numbers.element());
//        out.println("The queue after element() method is called: " + numbers);
//        out.println(numbers.remove());
//        out.println("The queue after remove() method is called: " + numbers);
//        out.println(numbers.peek());
//        out.println("The queue after peek() method is called: " + numbers);
//        out.println(numbers.poll());
//        out.println("The queue after poll() method is called: " + numbers);

        out.println();

        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            out.println(itr.next());
        }
    }
}
