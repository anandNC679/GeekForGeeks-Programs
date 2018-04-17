package com.string;

/**
 * author anand.
 * since on 6/4/18.
 */
public class StringReduceSum {
    public static void main(String[] args) {
        String str = "1234567879";
        int thr = 10;

        String result = sumOfString(str, thr);
        String newString = result.substring(0,result.length()-2);
        int newThr = Integer.parseInt(newString);
        int newStringPos = result.indexOf(result.length()-1);
         newString = newString.concat(str.substring(newStringPos));


    }

    private static String sumOfString(String str, int thr) {
        int sum =0;
        int pos=0;
        for(int i= 0;(sum+Integer.parseInt(String.valueOf(str.charAt(i))))<thr;i++){
                sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));
                pos = i;
        }
        return (""+sum)+pos;
    }
}
