package com.thread;

/**
 * author anand.
 * since on 8/4/18.
 * Example: Consumer and Producer

 */
public final class TestMessageBox {

    static {
        System.out.println("static block");
    }

    public TestMessageBox() {
        System.out.println("default cunstructer");
    }
    public TestMessageBox(String x) {
        this();
        System.out.println("paramitarized cunstructer");
    }


    public static void main(String args[]){
        new TestMessageBox("x");
    }
}

