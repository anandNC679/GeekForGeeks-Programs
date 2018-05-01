package com.string;

/**
 * author anand.
 * since on 20/3/18.
 */
public class MaxRepeatingchar {

    public static void main(String args[]){

        String str="aaaabbaabbbbbbbbccde";
        char ch=str.charAt(0);
        int max_count=0;
        for(int i=0;i<str.length();i++){
            int curr_count=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)!=str.charAt(j)){
                    break;
                }
                curr_count++;
            }
            if(curr_count>max_count){
                max_count=curr_count;
                ch=str.charAt(i);
            }
        }

        System.out.println(ch+" "+max_count);
    }
}
