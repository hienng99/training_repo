package java8.stream.sequential;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 2, 1, 9, 6, 4, 5, 2, 4);

//        list.stream().forEach((num) -> {
//            System.out.println(num);
//        });

        //filter
//        Stream<Integer> integerStream = list.stream().filter(number -> number % 2 == 0);
//        integerStream.forEach(System.out::println);

        //skip and limit
//        list.stream().skip(3).limit(4).forEach(System.out::println);

        //map
//        list.stream().map(number -> number * number).forEach(System.out::println);

        //sorted
//        list.stream().sorted((a,b) -> b - a).forEach(System.out::println);

        //forEach

        //collect
//        Set<Integer> set = list.stream().collect(Collectors.toSet());
//        System.out.println(set);

        //anyMatch
//        boolean result = list.stream().anyMatch(number -> number %5 == 0);
//        System.out.println(result);

        //allMatch
//        boolean result = list.stream().allMatch(x -> x<8);
//        System.out.println(result);

        //noneMatch
//        boolean result = list.stream().noneMatch(x -> x < 0);
//        System.out.println(result);

        //count
//        long counter = list.stream().count();
//        System.out.println(counter);

        //min and max
//        System.out.println(list.stream().min(Integer::compare).get());
//        System.out.println(list.stream().max(Integer::compare).get());

        //reduce
        System.out.println(list.stream().reduce(5, (a, b) -> a + b));
    }
}
