package com.oops;

/**
 * author anand.
 * since on 25/4/18.
 */
interface P{

}
class Person implements P{
    String name;
    int id;
    void show(){
        System.out.println("sample method:");
    }
}
public class MarkerInterfaceExample {
    public static void main(String args[]){
        Person person=new Person();
        if(person instanceof P)
        person.show();
        else
            System.out.println("no permission:");


    }

}
