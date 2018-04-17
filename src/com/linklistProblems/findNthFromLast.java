package com.linklistProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * author anand.
 * since on 2/4/18.
 * find nth value from last
 * ex. 12 23 43 22 56 67
 * 4th value from last
 * output:43
 */
public class findNthFromLast {

    public static void main(String args[]){
     List list=new LinkedList();

     for(int i=10;i<=100;i=i+10)
     {
         list.add(i);
        // System.out.println(list.get(i));
     }
        System.out.println(list);
        System.out.println(list.get(list.size()-4));


    }

}
