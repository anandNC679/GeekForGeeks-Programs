package com.oops.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * author anand.
 * since on 22/4/18.
 */
public class ReduceMethodExample {
    public static void main(String a[]){
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.forEach(i-> System.out.print(i+" "));

        Function<Integer,Integer> function=new Function<Integer,Integer>() {
            @Override
            public Integer apply(Integer o) {
                return o*2;
            }
        };

        BinaryOperator<Integer> b=new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };


        Stream stream1=list.stream();
        Stream stream2=stream1.map(function);
        int result=(Integer) stream2.reduce(0,b);
        System.out.println("\n"+result);

        System.out.println(list.stream().reduce(0,(c,e)->(c+e)-2*(c-e)));
        //stream.map()

        List<String> countries = Arrays.asList("Germany", "England", "China",
                "Denmark", "Brazil", "France", "Australia");

        Optional<String> longestCountryName=countries.stream()
                .reduce((a1,b1)-> a1.length()>b1.length() ? a1:b1);
        longestCountryName.ifPresent(System.out::println);

        String str=countries.stream().sorted().reduce("countries name: ",(x,y) -> x+" | "+y);
        System.out.println(str);

    }
}
