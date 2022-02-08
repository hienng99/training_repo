package collections.iteratorandlistiterator.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        words.add("The");
        words.add("sky");
        words.add("is");
        words.add("blue");

        Iterator itr = words.iterator();
        while(itr.hasNext()) {
            out.println(itr.next());
        }

        out.println();

        //Why do we use Iterator instead os forEach
//        for(String word : words) {
//            out.println(word);
//            words.remove(word);
//        }

        Iterator itr2 = words.iterator();
        while(itr2.hasNext()) {
            out.println(itr2.next());
            itr2.remove();
        }
        out.println(words);
    }
}
