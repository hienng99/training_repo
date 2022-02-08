package java8.stream.parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int len = 100000;
        int i = 0;
        for( ; i < len; i++) {
            list.add(UUID.randomUUID().toString());
        }

        //sequential stream
        long start1 = System.currentTimeMillis();
        list.stream().sorted().count();
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);

        //parallel stream
        long start2 = System.currentTimeMillis();
        list.parallelStream().sorted().count();
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
    }
}
