package com.oops.java8;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * author anand.
 * since on 18/4/18.
 */
public class JavaStreams {
    public static void main(String args[]){

        //1
        IntStream
                .range(1,11)
                .forEach(System.out::print);

        System.out.println();
        //2
        IntStream
                .range(1,11)
                .skip(5)
                .forEach(x -> System.out.print(x+" "));

        System.out.println();

        //3
        System.out.print("sum of 1 to 10 = " +
                IntStream
                .range(1,11)
                .sum()
        );

        System.out.println();

        //4
        Stream.of("anand","ave","barbara")
                .sorted()
                .findFirst()
                .ifPresent(System.out::print);

        System.out.println();

        //5 stream from Array sort,filter and print
        String[] names={"sam","anand","raja","sanam","sonu","sikha","biru"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("s"))
                .sorted()
                .forEach(name -> System.out.print(name+" "));

        System.out.println();

        //6 avg of square of an array
        Arrays.stream(new int[] {2,3,5,7,10 })
                .map(x->x*x)
                .average()
                .ifPresent(System.out::print);
    }
}
