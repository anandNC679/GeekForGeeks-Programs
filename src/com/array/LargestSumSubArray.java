package com.array;

/**
 * author anand.
 * since on 20/3/18.
 */
public class LargestSumSubArray {
    public static void main(String args[]){
        int arr[]={ -2, -3, 4, -1, -2, 1, 5, -3};
        findSumAndSubArray(arr,arr.length);
    }

    private static void findSumAndSubArray(int[] arr,int len) {
        int max_so_far=Integer.MIN_VALUE;
        int max_ending_here=0;
        int start=0,end=0,s=0;

        for(int i=0;i<len;i++){

            max_ending_here+=arr[i];
            if(max_so_far<max_ending_here){
                max_so_far=max_ending_here;
                start=s;
                end=i;
            }
            if(max_ending_here<0){
                max_ending_here=0;
                s=i+1;
            }
        }
        System.out.println("max sum:-"+max_so_far);
        System.out.println("start index:"+start+", end index: "+end);
    }
}
