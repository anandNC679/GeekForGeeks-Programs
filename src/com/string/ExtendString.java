package com.string;

/**
 * author anand.
 * since on 29/3/18.
 */
public class ExtendString {
    public static void main(String args[]){
        String str="C2B3A1D6z2";
        String result="";
        for(int i=1;i<str.length();i=i+2){
            int num=Integer.valueOf(str.charAt(i))-48;
            for(int j=1;j<=num;j++){
                result+=str.charAt(i-1);
            }
        }
        System.out.println(result);
    }
}
