package com.oops;

/**
 * author anand.
 * since on 17/4/18.
 */
interface A{
    int i=5;
    void show();
}
interface B{
    int i=10;
    void show();
}
class ShowClass implements A,B{

    @Override
    public void show() {
        System.out.println("show method called: ");
    }
}
public class TwoInterfaceSameMethod {
    public static void main(String args[]){
        A showClass=new ShowClass();
        showClass.show();
    }
}
