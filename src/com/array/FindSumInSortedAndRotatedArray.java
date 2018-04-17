package com.array;

/**
 * author anand.
 * since on 5/4/18.
 *
 * Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
 Output: true
 There is a pair (6, 10) with sum 16

 Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 35
 Output: true
 There is a pair (26, 9) with sum 35

 Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 45
 Output: false
 There is no pair with sum 45.
 */
public class FindSumInSortedAndRotatedArray {

    public static void main(String args[]){
        int arr[]=new int[]{11, 15, 6, 8, 9, 10};
        int n=arr.length;
        int sum=21;
        if(checkSumInArray(arr,n,sum)){
            System.out.println("present:");
        }
        else{
            System.out.println("not present:");
        }
    }

    private static boolean checkSumInArray(int[] arr, int n, int sum) {

        int i=0;
        for(i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])
                break;;
        }
        int l=(i+1)%n;
        int r=i;

        while(l!=r){
            if(arr[l]+arr[r]==sum){
                System.out.println(arr[l]+" "+arr[r]);
                return true;
            }


            if(arr[l]+arr[r]<sum)
                l=(l+1)%n;
            else
                r=(n+r-1)%n;
        }
        return false;
    }


}
