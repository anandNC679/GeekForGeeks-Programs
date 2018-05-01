package com.oops.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * author anand.
 * since on 18/4/18.
 */

class ConsumerImpl implements Consumer {
    @Override
    public void accept(Object i) {
        System.out.print(i+" ");
    }
}
public class ForEachMethodEvaluation {
    public static void main(String args[]){
        List<Integer> list= Arrays.asList(1,2,3,4,5,55,67,43);

        //step 1
        Consumer c=new ConsumerImpl();
        list.forEach(c);
        System.out.println("\n--------------------------");


        //step 2
        Consumer c1=new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.print(o+" ");
            }
        };
        list.forEach(c1);
        System.out.println("\n------------------------------");


        //step 3
        Consumer c2=(Object o)->{
            System.out.print(o+ " ");
        };
        list.forEach(c2);
        System.out.println("\n-------------------------------");

        //step 4
        Consumer c3=o-> System.out.print(o);
        list.forEach(c3);
        System.out.println("\n---------------------------------");

        List<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<10000;i++){
            arrayList.add(i);
        }

        long startTime=System.nanoTime();
        //step 5
       list.forEach(i-> System.out.print(i));
        long endTime=System.nanoTime();
        System.out.println();
        long total=endTime-startTime;
        double seconds = (double)total / 1000000000.0;
        System.out.println(seconds+" seconds");


    }
}
