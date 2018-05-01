package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * author anand.
 * since on 20/3/18.
 */
public class CountWord {
    public static final int OUT=0;
    public static final int IN=1;
    public static int MaxInt=256;
    public static void main(String args[])
    {
        String str = "One two       three\n four\tfive  ";
        String str1="Bread butter and bread and butter and anand and anand bread";
        System.out.println("No of words : " + countWords(str));
        System.out.println("**************************\ncount all words: ");
        countAllWords(str1);
        System.out.println("**************************\ncount all duplicate words: ");
        countDublicateWords(str1);
        System.out.println("**************************");
        countOneCharacterInString(str1);

        System.out.println("**************************\nAll charecters in string:");
        countAllCharacterInString(str1);

        System.out.println("**************************\n Maximum accuerence char in string is: ");
        countMaxCharFromString(str1);
        
//        System.out.println("**************************\n All words in file: ");
//        countAllWordsFromFile();


    }

    private static void countMaxCharFromString(String str1) {
        
        int count[]=new int[MaxInt];
        int max=Integer.MIN_VALUE;
        char c = 0;
        for(int i=0;i<str1.length();i++)
            count[str1.charAt(i)]++;
        
        for(int i=0;i<str1.length();i++){
            if(max<count[str1.charAt(i)]){
                max=count[str1.charAt(i)];
                c=str1.charAt(i);
            }
        }
        System.out.println(c+" "+max);
    }

    private static void countAllWordsFromFile() {

    }

    private static void countAllCharacterInString(String str1) {

        HashMap<Character,Integer> countCharacter=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            if(countCharacter.containsKey(str1.charAt(i))){
                countCharacter.put(str1.charAt(i),countCharacter.get(str1.charAt(i))+1);
            }
            else if(str1.charAt(i)==' '){
                continue;
            }
            else {
                countCharacter.put(str1.charAt(i),1);
            }
        }

        Set<Character> allKey=countCharacter.keySet();
        for(Character key:allKey){
            System.out.println(key+" "+countCharacter.get(key));
        }

    }

    private static void  countOneCharacterInString(String str1) {
        System.out.println("count all 'a' in :\n"+str1);

        int count=str1.length()-str1.replaceAll("a","").length();
        System.out.println("total 'a'= ");
    }

    private static void countAllWords(String str1) {

        String[] allWords=str1.split(" ");
        System.out.println(str1);
        System.out.println(allWords.length);
    }

    private static void countDublicateWords(String inputString) {

        HashMap<String,Integer> wordCountMap=new HashMap<>();
        String[] strArray=inputString.split(" ");

        for(String word:strArray){
            if(wordCountMap.containsKey(word.toLowerCase())){
                wordCountMap.put(word.toLowerCase(),wordCountMap.get(word.toLowerCase())+1);
            }
            else {
                wordCountMap.put(word.toLowerCase(),1);
            }
        }

        Set<String> keySet=wordCountMap.keySet();
        System.out.println(inputString);
        for (String word:keySet){
            if(wordCountMap.get(word) > 1){
                System.out.println(word+" "+wordCountMap.get(word));
            }

        }
    }

    private static int countWords(String str) {
        int wc=0;
        int i=0;
        int state=1;
        while (i<str.length()){
            if(str.charAt(i)==' ' || str.charAt(i)=='\n' || str.charAt(i)=='\t')
                state=1;
            else if(state==1){
                state=0;
                ++wc;
            }
            ++i;
        }
        return wc;
    }
}
