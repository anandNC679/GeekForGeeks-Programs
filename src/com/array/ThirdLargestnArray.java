package com.array;

/**
 * author anand.
 * since on 20/3/18.
 */
public class ThirdLargestnArray {
    public static void main(String args[]){
        int arr[]={12, 13, 1, 10, 34, 16};

        int first=arr[0],second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }
            else
                if(arr[i]>second){
                third=second;
                second=arr[i];
                }
                else if(arr[i]>third){
                third=arr[i];
                }
        }
        System.out.println(third);

    }
}
