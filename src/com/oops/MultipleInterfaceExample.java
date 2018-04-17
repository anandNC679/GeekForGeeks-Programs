package com.oops;

/**
 * author anand.
 * since on 10/4/18.
 */
interface Printable{
    void print();
}
interface Showable{
    void print();
    void show();
}
class Checkpost implements Printable,Showable{

    @Override
    public void print() {
        System.out.println("Printable interface:");
    }

    @Override
    public void show() {
        System.out.println("showable interface:");
    }
}
public class MultipleInterfaceExample {
    public static void main(String args[]){
        Showable checkpost=new Checkpost();
        checkpost.show();
    }
}
