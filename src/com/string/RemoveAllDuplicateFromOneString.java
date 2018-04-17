package com.string;

/**
 * author anand.
 * since on 5/4/18.
 */
public class RemoveAllDuplicateFromOneString {
    public static int MaxInt=256;
    public static void main(String arg[]){
        String str="geeksforgeeks";
        String temp="mask";

        int count[]=countAllAlphabets(str);
        char ch[]=str.toCharArray();
        int i=0,j=0;
        while (i!=ch.length){
            char c=ch[i];
            if(ch[c]==0){
                ch[j]=ch[i];
                j++;
            }
            i++;
        }

    }

    private static int[] countAllAlphabets(String str) {
        int count[]=new int[MaxInt];
        for(int i=0;i<str.length();i++)
            count[str.charAt(i)]++;
        return count;
    }
}
