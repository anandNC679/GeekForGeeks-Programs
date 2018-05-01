package com.oops.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * author anand.
 * since on 18/4/18.
 */
public class StreamExamples {
    public static void main(String args[]){
        List<Integer> list= Arrays.asList(1,4,5,3,2,8,6,4,5,3,3);
        long count=list.stream().count();

        System.out.println("as set: "+list.stream().collect(Collectors.toSet())
                    +" "+Arrays.stream(list.toArray()));

        Stream<Integer> stream=list.stream().filter(integer -> integer%2!=0)
                .sorted()
                .distinct();

        stream.forEach(integer -> System.out.print(integer+" "));
        System.out.println("\ncount="+count);

        List<String> str=Arrays.asList("1","4","5","2","5");
        Stream<Integer> stream1=str.stream().map(Integer::valueOf);
        stream1.forEach(integer -> System.out.print(integer+" "));

        System.out.println();
        List<String> languages = Arrays.asList("French", "German", "Hindi", "Sanskrit");
        Stream<String> stream2=languages.stream().map(String::toUpperCase).sorted();
        stream2.forEach(s -> System.out.print(s+" "));

        System.out.println();
        Stream<Double> integers = Stream.of(1.1, 2.2, 3.3);

        integers = integers.filter(d -> d > 2);
        integers.filter(d -> d > 3).forEach(System.out::println);

    }
}
