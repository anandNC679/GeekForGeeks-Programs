package com.oops.java8;

/**
 * author anand.
 * since on 18/4/18.
 */

interface Vehicle{

    String getBrand();
    String speedUp();
    String slowDown();
    default String turnLightOn(){
        return "Light is turning on: ";
    }
    default String turnLightOff(){
        return "Light is turning off: ";
    }

    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
}

interface Alart{


    default String turnLightOn(){
        return "Alart Light is turning on: ";
    }
    default String turnLightOff(){
        return "Alart Light is turning off: ";
    }
}
class Car implements Vehicle,Alart{
    String brand;
    Car(String brand){
        this.brand=brand;
    }

    @Override
    public String turnLightOn(){
        return Vehicle.super.turnLightOn() + " " + Alart.super.turnLightOn();
    }

    @Override
    public String turnLightOff() {
        return Alart.super.turnLightOff();
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "Car is speeding up:";
    }

    @Override
    public String slowDown() {
        return "car is slowing down:";
    }
}

public class DefaultMethod {
    public static void main(String args[]){
        Vehicle v=new Car("BMW");
        System.out.println(v.getBrand());
        System.out.println(v.speedUp());
        System.out.println(v.slowDown());
        System.out.println(v.turnLightOn());
        System.out.println(v.turnLightOff());
        System.out.println(Vehicle.getHorsePower(2500,480));
    }
}
