package com.oops;

import java.util.ArrayList;
import java.util.List;

/**
 * author anand.
 * since on 8/4/18.
 */

class Student{
    String name;
    int roll;
    String dept;

    public Student(String name, int roll, String dept) {
        this.name = name;
        this.roll = roll;
        this.dept = dept;
    }
}

class Department{
    String deptName;
    List<Student> students;

    public Department(String deptName, List<Student> students) {
        this.deptName = deptName;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}

class Institute{
    String instituteName;
    List<Department> departments;


    public Institute(String instituteName, List<Department> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }

    public int totalNoOfStudent(){
        int totalStudent=0;
        List<Student> studentList;
        for(Department dept:departments){
            studentList=dept.students;
            for(Student student:studentList){
                totalStudent++;
            }
        }
        return totalStudent;
    }
}

public class HasARelationshipExample {
    public static void main(String args[]){
        Student student1=new Student("aman",101,"cse");
        Student student2=new Student("raaj",115,"ee");
        Student student3=new Student("takir",121,"ee");
        Student student4=new Student("rahul",151,"cse");
        Student student5=new Student("vina",110,"cse");
        Student student6=new Student("anhula",111,"cse");

        List<Student> cscStudent=new ArrayList<>();
        cscStudent.add(student1);
        cscStudent.add(student4);
        cscStudent.add(student5);
        cscStudent.add(student6);
        List<Student> eeStudent=new ArrayList<>();
        eeStudent.add(student2);
        eeStudent.add(student3);

        Department csedepartment=new Department("cse",cscStudent);
        Department eedepartment=new Department("ee",eeStudent);
        List<Department> departments=new ArrayList<>();
        departments.add(csedepartment);
        departments.add(eedepartment);

        Institute institute=new Institute("NIT",departments);
        System.out.println("total student="+institute.totalNoOfStudent());


    }
}
