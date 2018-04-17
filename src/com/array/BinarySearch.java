package com.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * author anand.
 * since on 22/3/18.
 */
public class BinarySearch {
    public static void main(String args[]){
        int arr[]={12,43,45,23,44,87,98,67,51};
        BinarySearch binarySearch=new BinarySearch();
        Scanner scanner=new Scanner(System.in);
        int key=scanner.nextInt();
        Arrays.sort(arr);

        for(int a:arr)
            System.out.print(a+" ");

        int index=binarySearch.doBinarySearch(arr,0,arr.length-1,key);
        if(index==-1)
            System.out.println("\n"+key+" not found:");
        else
            System.out.println("\nelement found in index "+index);

    }

    public int doBinarySearch(int[] arr, int low, int high, int key) {

        if(high<low)
            return -1;
        int mid=(low+high)/2;

        if(key==arr[mid])
            return mid;

        if(key>arr[mid])
            return doBinarySearch(arr,mid+1,high,key);
        return doBinarySearch(arr,low,mid-1,key);
    }
}
