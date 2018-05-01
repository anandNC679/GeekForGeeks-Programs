package com.java_algoritham;

import java.util.Arrays;
import java.util.List;

/**
 * author anand.
 * since on 23/4/18.
 */
public class BinarySearchExample {

    public static void main(String args[]){
        List<Integer> list= Arrays.asList(1,54,63,34,52,22,5,21,7);
        Arrays.sort(list.toArray());
        list.stream().sorted()
                .findAny().ifPresent(integer -> System.out.println(integer));


        int arr[]=new int[]{1,54,63,34,52,22,5,21,7};
        Arrays.sort(arr);
       int x= Arrays.binarySearch(arr,22);
        System.out.println(x);
    }
}
