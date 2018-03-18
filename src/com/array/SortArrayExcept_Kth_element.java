package com.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * author anand.
 * since on 18/3/18.
 */
public class SortArrayExcept_Kth_element {
    static Scanner scanner;
    public static void main(String args[]){
        scanner =new Scanner(System.in);
        System.out.print("\nEnter length of array:- ");
        int len=scanner.nextInt();
        int arr[]=new int[len];
        System.out.println("Enter elements:");
        for(int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
        }
        SortArrayExcept_Kth_element obj = new SortArrayExcept_Kth_element();

        System.out.print("\nElement position of arr to not be sort :- ");
        int k=scanner.nextInt();
        obj.sortExceptKthElement(arr,k,len);
        obj.printArray(arr,len);
    }

    private void sortExceptKthElement(int[] arr, int k, int len) {
        int temp=arr[k-1];
        arr[k-1]=arr[len-1];
        arr[len-1]=temp;
        Arrays.sort(arr,0,len-1);
        int last=arr[len-1];
        for(int i=len-1;i>=k;i--)
            arr[i]=arr[i-1];
        arr[k-1]=last;
    }

    private void printArray(int[] arr, int len) {
        System.out.println("\nArray elements are:-");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
