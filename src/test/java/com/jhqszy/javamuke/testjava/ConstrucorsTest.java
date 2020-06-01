package com.jhqszy.javamuke.testjava;

/**
 * 父类、子类静态代码块和普通代码块执行顺序练习
 */
class Root{
    static {
        System.out.println("Root静态代码块");
    }
    {
        System.out.println("Root的普通代码块");
    }
    public Root(){
        System.out.println("Root的无参构造方法");
    }
}

class Mid extends Root{
    static {
        System.out.println("Mid静态代码块");
    }
    {
        System.out.println("Mid的普通代码块");
    }
    public Mid(){
        System.out.println("Mid的无参构造方法");
    }
    public Mid(String Msg){
        this();
        System.out.println("Mid的有参数构造器"+Msg);
    }
}

class Leaf extends Mid{
    static {
        System.out.println("Leaf静态代码块");
    }
    {
        System.out.println("Leaf的普通代码块");
    }
    public Leaf(){
        //super调用父类Mid的有参构造器
        super("hahah");
        System.out.println("Leaf的无参构造方法");
    }

}

public class ConstrucorsTest {
    public static void main(String[] args) {
        new Leaf();
        //创建第二个Leaf对象时，因为内存中已经存在Leaf类，所以不必再进行类初始化
        new Leaf();
    }
}
