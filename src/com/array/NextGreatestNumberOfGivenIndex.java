package com.array;

/**
 * author anand.
 * since on 28/3/18.
 */
public class NextGreatestNumberOfGivenIndex {

    public static void main(String args[]){
        int arr[]={3, 4, 2, 7, 5, 8, 10, 6};
        int indexes[]={3,6,1};

        for(int i=0;i<indexes.length;i++){
            int temp=indexes[i];
            boolean flag=false;
            for(int j=temp+1;j<arr.length;j++){
                if(arr[temp]<arr[j]){
                    System.out.println(arr[j]);
                    flag=true;
                    break;
                }
            }
            if(!flag)
            System.out.println(-1);
        }
    }
}
