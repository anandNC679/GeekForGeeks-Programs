package com.array;

import java.util.Scanner;

/**
 * author anand.
 * since on 18/3/18.
 */
public class Sort_0_atLeft_1_atLast {
    static Scanner scanner;
    public static void main(String args[]){
        scanner=new Scanner(System.in);
        System.out.println("Enter length:");
        int len=scanner.nextInt();
        int arr[]=new int[len];
        System.out.println("Enter Elements:");
        for(int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
        }
        Sort_0_atLeft_1_atLast sort_0_atLeft_1_atLast=new Sort_0_atLeft_1_atLast();
        sort_0_atLeft_1_atLast.sortArrayOn0and1(arr,len);

    }

    private void sortArrayOn0and1(int[] arr, int len) {
        int temp0=0;
        int temp1=len-1;

        if(checkArrayIsPerfect(arr,len)){
            while (temp0<temp1){
                if(arr[temp0]==1){
                    arr[temp0]=arr[temp0]+arr[temp1];
                    arr[temp1]=arr[temp0]-arr[temp1];
                    arr[temp0]=arr[temp0]-arr[temp1];
                    temp1--;
                }
                else {
                    temp0++;
                }
            }
            printArray(arr,len);
        }else {
            System.out.println("Array should contain only 0 and 1");
        }
    }

    private boolean checkArrayIsPerfect(int[] arr, int len) {
        boolean flag=true;
        for(int i=0;i<len;i++){
            if(arr[i]!=0 && arr[i]!=1) {
                flag = false;
                break;
            }
        }
        if(flag){
            return true;
        }else {
            return false;
        }
    }

    private void printArray(int[] arr,int len) {
        System.out.println();
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
