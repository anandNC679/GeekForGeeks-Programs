package com.string;

import java.util.Scanner;

/**
 * author anand.
 * since on 20/3/18.
 */
public class ReverseString {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String str="This is my book";
        String out="Book my is this";


        String[] temp=str.split(" ");
        String result="";
        for(int i=0;i<temp.length;i++){
            if(i==temp.length-1)
                result=temp[i]+result;
            else
                result=" "+temp[i]+result;

        }
        System.out.println(str);
       result = Character.toUpperCase(result.charAt(0)) + result.substring(1);

        System.out.println(result);

       String reverseStr= recursiveMethod("anand");
        System.out.println(reverseStr);
        System.out.println("----->   "+reverseMethod("malala"));

        //Java Program To Reverse The String With Preserving The Position Of Spaces :
        String str2="I Am Not String";
        reverseStringPreserveSpace(str2);
    }

    private static void reverseStringPreserveSpace(String str2) {

        char[] str2CharArray=str2.toCharArray();
        char[] resultArray=new char[str2.length()];

        int j=str2.length()-1;
        for(int i=0;i<str2.length();i++){
            if(str2.charAt(i)==' '){
                resultArray[i]=' ';
            }
        }

        for(int i=0;i<str2.length();i++){
            if(str2CharArray[i]!=' '){
                if(resultArray[j]==' ')
                    j--;
                resultArray[j--]=str2CharArray[i];
            }
        }
        System.out.println(str2);
        System.out.println(resultArray);


    }

    static String recursiveMethod(String str)
    {
        if ((null == str) || (str.length() <= 1))
        {
            return str;
        }

        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
    static String reverseMethod(String str){
        int first=0;
        int last=str.length()-1;

        while (first<last){
            swap(str,first,last);
            first++;
            last--;
        }
       return str;
    }

    private static String swap(String str, int first, int last) {
        char ch[]=str.toCharArray();
        char temp=ch[first];
        ch[first]=ch[last];
        ch[last]=temp;
        str=new String(ch);
        return str;
    }
}
