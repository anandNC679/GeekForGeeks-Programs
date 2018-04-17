package com.string;

import java.util.Scanner;

/**
 * author anand.
 * since on 3/4/18.
 * System.out.println(countPalin("Madam Arora teaches malayalam"));

 System.out.println(countPalin("Nitin "
 + "speaks malayalam"));
 */
public class CountPolindromInString {

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("total polindrome:-");
        //String input=scanner.next();
        System.out.println(countPolindrome("Madam Arora teaches malayalam"));
    }

    private static int countPolindrome(String input) {

        input=input+" ";
        int len=input.length();
        String word="";
        int count=0;

        for(int i=0;i<len;i++){

            char ch=input.charAt(i);
            if(ch!=' '){
                word+=ch;
            }
            else {
                if(checkPolindrome(word))
                    count++;
                word="";
            }
        }
       return count;
    }

    private static boolean checkPolindrome(String word) {
        int n=word.length();
        word=word.toLowerCase();
        for(int i=0;i<n;i++,n--){
            if(word.charAt(i)!=word.charAt(n-1))
                return false;
        }
        return true;
    }
}
