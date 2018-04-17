package com.array;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * author anand.
 * since on 12/4/18.
 */
public class IntersectionOfTwoArray {
    public static void main(String args[]){
        int arr1[]={10,20,30,40,50};
        int arr2[]={20,30,34,56,76};
        int m=arr1.length;
        int n=arr2.length;
        int arr3[] = {7, 1, 5, 2, 3, 6};
        int arr4[] = {3, 8, 6, 20, 7};
        int m1=arr3.length;
        int n1=arr4.length;
        findIntersectionOfTwoArray(arr1,arr2,m,n);
        System.out.println();
        findUnionOfTwoArray(arr1,arr2,m,n);
        System.out.println("\nUnsorted array");

        findIntersectionOfTwoUnsortedArray(arr3,arr4,m1,n1);
        System.out.println();
        findUnionOfTwoUnsortedArray(arr3,arr4,m1,n1);
    }

    private static void findUnionOfTwoUnsortedArray(int[] arr1, int[] arr2, int m1, int n1) {
        Set<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<m1;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<n1;i++){
            if(!set.contains(arr2[i])){
                set.add(arr2[i]);
            }
        }
        for(Integer val:set)
            System.out.print(val+" ");
    }

    private static void findIntersectionOfTwoUnsortedArray(int[] arr1, int[] arr2, int m1, int n1) {

    }

    private static void findUnionOfTwoArray(int[] arr1, int[] arr2, int m, int n) {
        int i=0,j=0;
        while (i<m && j<n){
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i++]+" ");
            }
            else if(arr2[j]<arr1[i]){
                System.out.print(arr2[j++]+" ");
            }
            else {
                System.out.print(arr2[j]+" ");
                j++;
                i++;
            }
        }
        while (i<m)
            System.out.print(arr1[i++]+" ");
        while (j<n)
            System.out.print(arr2[j++]+" ");
    }

    private static void findIntersectionOfTwoArray(int[] arr1, int[] arr2, int m, int n) {
        int i=0,j=0;
        while (i<m && j<n){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else {
                System.out.print(arr2[j]+" ");
                j++;
                i++;
            }
        }
    }
}

