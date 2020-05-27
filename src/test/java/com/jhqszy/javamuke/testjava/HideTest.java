package com.jhqszy.javamuke.testjava;


class Parent{
    public String tag = "爸爸";
}
class Derived extends Parent {
    private String tag = "儿子";

}

public class HideTest{

    public static void main(String[] args) {
        Derived d = new Derived();
        //d为子类对象，会优先访问子类中的tag变量，报错，因为为private
//        System.out.println(d.tag);
        //将自类变量d向上转型为父类对象，访问父类中的public的tag变量
        System.out.println(((Parent)d).tag);
    }

}
