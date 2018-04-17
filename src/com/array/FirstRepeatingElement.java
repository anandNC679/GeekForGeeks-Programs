package com.array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * author anand.
 * since on 12/4/18.
 */
public class FirstRepeatingElement {
    public static void main(String args[]){
        int arr[]={10,4,5,3,56,7,10,8,3,4};
        int len=arr.length;
        findFirstRepeatingElementFromArray(arr,len);
        printAllDistinctElementFromArray(arr,len);
    }

    private static void printAllDistinctElementFromArray(int[] arr, int len) {
        Set<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<len;i++){
            if(!set.contains(arr[i])) {
                set.add(arr[i]);
                System.out.print(arr[i]+" ");
            }
        }
    }

    private static void findFirstRepeatingElementFromArray(int[] arr, int length) {
        HashSet<Integer> set=new HashSet<>();
        int min=0;
        for(int i=length-1;i>=0;i--){
            if(set.contains(arr[i])){
                min=i;
            }else {
                set.add(arr[i]);
            }
        }
        System.out.println(arr[min]);
    }
}
