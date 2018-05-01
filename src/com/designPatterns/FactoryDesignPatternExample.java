package com.designPatterns;

/**
 * author anand.
 * since on 22/4/18.
 */
interface OS{
    void show();
}
class Android implements OS{

    @Override
    public void show() {
        System.out.println("most powefull os");
    }
}
class IOS implements OS{
    @Override
    public void show() {
        System.out.println("most secure os");
    }
}
class Windows implements OS{
    @Override
    public void show() {
        System.out.println("killing people");
    }
}
class OperatingSystemFactory{
    public static OS getInstance(String str){

        if(str.equals("open source"))
            return new Android();
        else if(str.equals("secure os"))
            return new IOS();
        else
            return new Windows();
    }
}
public class FactoryDesignPatternExample {
    public static void main(String args[]){

        OS os=OperatingSystemFactory.getInstance("andibandi");
        os.show();
    }
}
