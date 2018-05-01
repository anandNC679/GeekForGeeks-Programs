package com.random;

import java.util.Random;

/**
 * author anand.
 * since on 21/4/18.
 */
public class RandomClassExample {
    public static void main(String args[]){
        Random random=new Random();

        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=random.nextInt(100);
        }

        for(int i:arr)
            System.out.print(i+" ");
    }
}
