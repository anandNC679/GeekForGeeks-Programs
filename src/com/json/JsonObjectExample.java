package com.json;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * author anand.
 * since on 1/4/18.
 */
class Student implements Serializable{

    int id;
    String name;
    String address;
    public transient int SSN;

    public Student(int id, String name, String address,int SSN) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.SSN=SSN;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return ""+getId()+" "+getName()+" "+getAddress()+" "+getSSN();
    }
}
public class JsonObjectExample {

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        Map<Integer,Student> map = new HashMap<Integer,Student>();
        map.put(1,new Student(1001,"ram","bengalore",123456));
        map.put(2,new Student(2001,"sham","ranchi",987654));

        Set<Map.Entry<Integer, Student>> entries=map.entrySet();

        for(Map.Entry entry:entries){
            Student student= (Student) entry.getValue();

            System.out.println(entry.getKey()+":"+student);
        }


        FileOutputStream fos=new FileOutputStream("/home/anand/student.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(map);

        FileInputStream fileInputStream=new FileInputStream("/home/anand/student.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);

        Map<Integer,Student> serializedMap= (Map<Integer, Student>) objectInputStream.readObject();


        System.out.println("\nserialized student list:");
        for(Map.Entry entry:serializedMap.entrySet()){
            Student student= (Student) entry.getValue();

            System.out.println(entry.getKey()+":"+student);
        }



    }
}
