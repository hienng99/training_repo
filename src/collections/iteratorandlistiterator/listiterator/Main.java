package collections.iteratorandlistiterator.listiterator;

import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("The");
        words.add("sky");
        words.add("is");
        words.add("blue");

        ListIterator<String> listItr = words.listIterator();

        //forward direction
        while(listItr.hasNext()) {
            out.println(listItr.nextIndex() + " " + listItr.next());
        }

        out.println();

        //backward direction
        while(listItr.hasPrevious()) {
            out.println(listItr.previousIndex() + " " + listItr.previous());
        }

        out.println();

        //set method
        listItr.set("abc");
        for(String word : words) {
            out.println(word);
        }
    }
}
