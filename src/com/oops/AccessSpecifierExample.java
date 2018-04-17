package com.oops;

/**
 * author anand.
 * since on 7/4/18.
 */
public class AccessSpecifierExample {

    protected int x;
    public static void main(String args[]){
        AccessSpecifierExample accessSpecifierExample=new AccessSpecifierExample();
        System.out.println(accessSpecifierExample.x);

        for (int i=0;true;i++){
            System.out.println(i);
        }
    }
}
