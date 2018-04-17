package com.string;

/**
 * author anand.
 * since on 5/4/18.
 */
public class PrintAllDuplicate {
    public static int MaxInt=256;
    public static void main(String args[]){
        String str="geeksforgeeks";
        int[] count=new int[MaxInt];

        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }

        for(int i=0;i<MaxInt;i++){
            if(count[i]>1){
                System.out.println((char) i+" "+count[i]+" times");
            }
        }

    }
}
