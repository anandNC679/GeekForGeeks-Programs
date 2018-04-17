package com.string;

/**
 * author anand.
 * since on 20/3/18.
 */
public class SecondMostFrequentChar {

    public static void main(String args[]){
        String str="geeksforgeeks";
        final int max=256;
        int count[]=new int[max];
        for(int i=0;i<str.length();i++){
            (count[str.charAt(i)])++;
        }
        int first=0,second=0;
        for(int i=0;i<max;i++){

            if(count[i]>count[first]){
                second=first;
                first=i;
            }
            else if(count[i]>count[second] &&
                    count[i]!=count[first]){
                second=i;
            }
        }

        char ch= (char) first;
        System.out.println(ch);
    }
}
