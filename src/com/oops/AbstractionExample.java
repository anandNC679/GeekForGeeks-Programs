package com.oops;

/**
 * author anand.
 * since on 7/4/18.
 */
    abstract class Employee1{
        String name;
        float paymentPerHour;

        public abstract float calculateSalary();

    public Employee1(String name, float paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(float paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}

class Contractor extends Employee1{

        private int workingHour;
    public Contractor(String name, float paymentPerHour,int workingHour) {
        super(name, paymentPerHour);
        this.workingHour=workingHour;
    }

    @Override
    public float calculateSalary() {
        return getPaymentPerHour()*workingHour;
    }
}

class PermanentBasis extends Employee1{

    public PermanentBasis(String name, float paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public float calculateSalary() {
        return getPaymentPerHour()*8;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class AbstractionExample {

        public static void main(String args[]){

            Contractor contractor=new Contractor("amit",3000,5);
            PermanentBasis permanentBasis=new PermanentBasis("raju",1000);
            System.out.println(contractor.name);
            System.out.println(permanentBasis);
        }
}
