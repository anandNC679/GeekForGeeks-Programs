package com.sorting;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

/**
 * author anand.
 * since on 1/4/18.
 * The selection sort algorithm sorts an array by repeatedly
 * finding the minimum element (considering ascending order) from unsorted
 * part and putting it at the beginning.
 *
 * Time Complexity: O(n2) as there are two nested loops.

 Auxiliary Space: O(1)
 The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.


 Insertion Sort
 Insertion sort is a simple sorting algorithm that works the way we sort
 playing cards in our hands.
 */
public class Sorting {

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("\nEnter the length:");
        int len=scanner.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("unsorted array:-");
        printArray(arr,len);
        selectionSort(arr,len);
        System.out.println("\nselection sort:-");
        printArray(arr,len);

        insertionSort(arr,len);
        System.out.println("\ninsertion sort:-");
        printArray(arr,len);
    }

    private static void insertionSort(int[] arr, int len) {

        for(int i=1;i<len;i++){
            int j=i-1;
            int key=arr[i];
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }

    private static void printArray(int[] arr, int len) {

        for(int a:arr){
            System.out.print(a+" ");
        }
    }

    private static void selectionSort(int[] arr, int len) {

        int minIndex=0;
        for (int i=0;i<len-1;i++){
            minIndex=i;
            for (int j=i+1;j<len;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }

    }
}
