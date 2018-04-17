package com.thread;

/**
 * author anand.
 * since on 1/4/18.
 */
class Demo
{
    public synchronized void print(int n)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(n*i);
            try { Thread.sleep(500);

            }catch(Exception e){System.out.println(e);}

        }
    }
}
class Threaddemo extends Thread
{
    Demo d;
    Threaddemo(Demo d)
    {
        this.d=d;
    }
    public void run()
    {
        d.print(5);
    }

} class Threaddemo1 extends Thread
{
    Demo d;
    Threaddemo1(Demo d)
    {
        this.d=d;
    }
    public void run()
    {
        d.print(1000);
    }
}
public class MyMain
{
    public static void main(String args[])
    {
        Demo d=new Demo();
        Threaddemo ob1=new Threaddemo (d);
        Threaddemo1 ob2=new  Threaddemo1(d);
        ob1.start();
        ob2.start();
    }
}