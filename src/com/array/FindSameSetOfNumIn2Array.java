package com.array;

import java.util.Arrays;

import static java.util.Arrays.*;

/**
 * author anand.
 * since on 15/4/18.
 * given 2 arrays of unsorted numbers,check both arrays have same set of numbers.
 */
public class FindSameSetOfNumIn2Array {
    public static void main(String args[]){
        int a[]={2,5,6,8,10,2,2};
        int b[]={2,5,2,8,10,2,6};

        int count[]=new int[256];
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }

        for(int i=0;i<b.length;i++){
           count[b[i]]--;
        }


        boolean flag=true;
        for(int num=0;num<count.length;num++) {


            if (count[num] != 0) {
                flag=false;
                System.out.println("both arrays have not same set of number");
                break;
            }
            else
                continue;
        }
        if(flag){
            System.out.println("both arrays have same set of number");
        }
    }
}
