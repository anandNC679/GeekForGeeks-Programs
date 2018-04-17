package com.array;

/**
 * author anand.
 * since on 5/4/18.
 */
public class MaxSumPairInUnsortedArray {
    public static int arr[]=new int[]{12, 34, 10, 6, 40};
    public static void main(String args[]){
        int sum=findMaxPair(arr,arr.length);
        System.out.println(sum);
    }

    private static int findMaxPair(int[] arr,int n) {
        int first;
        int second;

        if(arr[0]>arr[1]){
            first=arr[0];
            second=arr[1];
        }
        else {
            first=arr[1];
            second=arr[0];
        }

        for(int i=2;i<n;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
        }
        return first+second;
    }

}
