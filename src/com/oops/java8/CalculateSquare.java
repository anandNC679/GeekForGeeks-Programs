package com.oops.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * author anand.
 * since on 17/4/18.
 */

@FunctionalInterface
interface Square{
    int calculate(int x);
}

interface Cube{
    int calculate(int x);
}

public class CalculateSquare{
    public static void main(String args[]){

        Square s = (int x) -> x*x;
        System.out.println(s.calculate(100));

        Cube c= (int x) -> x*x*x;
        System.out.println(c.calculate(10));


        List<Integer> list= Arrays.asList( 1,2,3,4,5,6,7,8);

        for(int x:list)
            System.out.print(x+" ");

        System.out.println();
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer+" ");
            }
        });
        System.out.println();

        list.forEach((Integer x)-> {
            if(x%2==0)
                System.out.println("even "+ x);
            else
                System.out.println("add "+x);
        });

        System.out.println("-----------------------------");
        list.forEach(System.out::println);
    }

}
