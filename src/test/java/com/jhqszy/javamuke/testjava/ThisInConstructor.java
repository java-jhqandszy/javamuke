package com.jhqszy.javamuke.testjava;

public class ThisInConstructor {
    //定义ThisInConstructor类的成员变量
    public int foo;
    public ThisInConstructor(){
        //定义构造器中的局部变量
        int foo = 0;
        //this代表该构造器正在初始化的对象，会将正在初始化的对象的foo成员变量的值设置为6
        //大部分时候在构造器中访问其他成员变量和方法都可以省略this，如果构造器中有合成员变量同名的局部变量又必须在构造器中访问这个被覆盖的成员变量，则this不可以省略
        this.foo=6;
    }

    public static void main(String[] args) {
        //构造器直接使用new关键字调用，所有使用该构造器创建的对象的foo成员变量的值都为6
        System.out.println(new ThisInConstructor().foo);
    }
}
