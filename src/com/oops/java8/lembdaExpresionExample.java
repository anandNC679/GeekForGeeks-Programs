package com.oops.java8;

import java.util.Comparator;

/**
 * author anand.
 * since on 17/4/18.
 */
public class lembdaExpresionExample {
    public static void main(String args[]){

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("simple thread example: ");
            }
        }).start();

        new Thread(() -> {
            System.out.println("lembda expression example: ");
        }).start();

        Comparator<String> c=(s1,s2)->{
            System.out.println("comparing s1 and s2");
            return s1.compareTo(s2);
        };
        int result=c.compare("108","10");
        System.out.println(result);
    }
}
