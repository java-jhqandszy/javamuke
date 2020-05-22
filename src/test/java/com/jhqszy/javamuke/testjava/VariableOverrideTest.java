package com.jhqszy.javamuke.testjava;

public class VariableOverrideTest {

    public String name = "李刚";
    public static double price = 78.0;
    public void info(){
        String name = "孙悟空";
        //定位到的是方法中的局部变量：孙悟空
        System.out.println(name);
        //定位到的是类的成员变量：李刚
        System.out.println("方法中this访问同名变量："+ this.name);
    }

    public static void main(String[] args) {
        int price = 65;
        //定位到的是方法中的局部变量：65
        System.out.println("mian方法中的局部变量："+price);
        //定位到的是类中的成员变量
        System.out.println("main中通过类访问类变量："+ VariableOverrideTest.price);
        //运行main方法
        new VariableOverrideTest().info();
    }
}
