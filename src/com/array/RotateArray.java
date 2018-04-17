package com.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * author anand.
 * since on 22/3/18.
 */
public class RotateArray {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int arr[]={12,43,45,23,44,87,98,67,51};
        System.out.println("sorted array:");
        Arrays.sort(arr);
        printArray(arr);
        System.out.println("\nEnter rotation number:");
        int d=scanner.nextInt();
        System.out.println("rotated array:");
        rotateArray(arr,d);
        printArray(arr);

    }

    private static void printArray(int[] arr) {
        for(int a:arr)
            System.out.print( a+" ");
    }

    private static void rotateArray(int[] arr, int d) {

        for(int i=0;i<d;i++){
            rotateArrayByOne(arr);
        }
    }

    private static void rotateArrayByOne(int[] arr) {
        int first=arr[0];
        int i;
        for(i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
    }
}
