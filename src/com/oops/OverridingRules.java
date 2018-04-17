package com.oops;

/**
 * author anand.
 * since on 8/4/18.
 */

class ParentClass{
    protected void m1() {
        System.out.println("super class ");
    }
}
public class OverridingRules extends ParentClass {

    public void m1() throws IndexOutOfBoundsException{
        System.out.println("child class:");
    }
}
