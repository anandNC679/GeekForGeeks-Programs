package com.array;

/**
 * author anand.
 * since on 22/3/18.
 */
public class SearchElementInSortedAndRotateArray {

    public static void main(String args[]){
        BinarySearch binarySearch=new BinarySearch();
        int arr[]={5, 6, 7, 8, 9, 10, 1, 2, 3};
        int pivot=findPivot(arr,0,arr.length-1);
        System.out.println("pivot index "+pivot);
        int key=2;
        int index=0;
        //array is not rotated at all
        if(pivot==-1)
            index=binarySearch.doBinarySearch(arr,0,arr.length-1,key);
        
        if(arr[pivot]==key)
            index=pivot;
       
        if(arr[0]<=key)
            index= binarySearch.doBinarySearch(arr,0,pivot-1,key);
        else
            index=binarySearch.doBinarySearch(arr,pivot+1,arr.length-1,key);
        System.out.println("key index "+index);
    }

    private static int findPivot(int[] arr, int low, int high) {
        if(high<low)
            return -1;
        if (high==low)
            return low;
        int mid =(low+high)/2;

        if(mid<high && arr[mid]>arr[mid+1])
            return mid;

        if (mid>low && arr[mid]<arr[mid-1])
            return mid-1;

        if(arr[low]>=arr[mid])
            return findPivot(arr,low,mid-1);
        return findPivot(arr,mid+1,high);
    }
}
