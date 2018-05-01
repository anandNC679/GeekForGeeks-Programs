package com.array;

import java.util.Arrays;

/**
 * author anand.
 * since on 29/4/18.
 *
 * Rearrange positive and negative numbers in O(n) time and O(1) extra space
 */
public class AlternateRearrenge_NegetiveAndPositive implements Cloneable{
    int i=-1;
    public static void main(String ar[]){
        int arr[]=new int[]{-1, 2, -3, 4, 5, 6, -7, 8, 9};

        int tempArray[]=arr.clone();
        int len=arr.length;
        AlternateRearrenge_NegetiveAndPositive obj=new AlternateRearrenge_NegetiveAndPositive();
         obj.printArray(arr);
        System.out.println("\nAfter saparate -ve and +ve:");
        obj.saparateNagativeAndPositiveNumber(arr,len);
        obj.printArray(arr);
        obj.doAlternate(arr,len);
        System.out.println("\nAfter alternate -ve and +ve:");
        obj.printArray(arr);

        System.out.println("\nprint positive to nagative wise saparation:-");
        obj.saparatePositiveAndNagative(tempArray);
        obj.printArray(tempArray);
    }

    private void saparatePositiveAndNagative(int[] tempArray) {

        int i=-1,temp=0;
        for(int j=0;j<tempArray.length;j++){
            if(tempArray[j]>0){
                i++;
                swap(tempArray,i,j);
            }
        }

    }

    private void doAlternate(int[] arr, int len) {
        int pos=i+1,neg=0;
        while (pos<len && neg<pos && arr[neg]<0){
            swap(arr,neg,pos);
            pos+=1;
            neg+=2;
        }
    }

    private void printArray(int[] arr) {
        Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
    }

    private void saparateNagativeAndPositiveNumber(int[] arr, int length) {
        int temp=0;
        for(int j=0;j<length;j++){
            if(arr[j]<0){
                i++;
                swap(arr, i, j);
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}


