package com.oops;

import java.util.Objects;

/**
 * author anand.
 * since on 26/3/18.
 */

class Employee{
    int salary;
    String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

}
public class EqualsMethodExample {
    public static void main(String args[]){
        Employee employee1=new Employee(25000,"amit");
        Employee employee2=new Employee(25000,"amit");
        //Employee employee3=new Employee(25000,"amit");

        if(employee2.equals(employee1)){
            System.out.println("equals");
        }else {
            System.out.println("false");
        }

        int data=15;
        String bytes=Integer.toBinaryString(data);
        System.out.println(115 & 15);

    }
}

