package com.oops.java8;

/**
 * author anand.
 * since on 18/4/18.
 */
interface A{
    void show(int i,int j);
}

//class AImpl implements A{
//    @Override
//    public void show(int i, int j) {
//        System.out.println("munis  "+(i-j));
//    }
//}
public class LembdaDemo {
    public static void main(String args[]){

//        A obj1=new AImpl();
//        obj1.show(100,10);
//        System.out.println("----------------------");
//
//        A obj2=new A() {
//            @Override
//            public void show(int i, int j) {
//                System.out.println("multiply " +i*j);
//            }
//        };
//        obj2.show(10,20);
        System.out.println("-----------------------");
        A obj;
        obj=(i,j)-> {
            System.out.println("plus "+(i+j));
        };
        obj.show(10, 20);

    }
}