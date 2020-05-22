package com.jhqszy.javamuke.testjava;

/**
 * 自定义构造器练习
 * 构造器：与类同名的方法，方法中进行变量初始化
 * 因为构造器主要用于被其他方法调用，因此修饰符要用public
 */
public class ConstructorTest {
    public String name;
    public int age;
    //构造方法，用于实例化类对象
    public ConstructorTest(String name,int age){
        //构造器中的this指的是当前被实例化的对象
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        //如果自定义了构造方法，则不能再使用系统默认的无参构造方法，即如果括号中不写参数会报错
        //如果仍想使用系统默认的无参构造器，则需要重载多个构造方法
        ConstructorTest constructorTest = new ConstructorTest("xiao",11);
        System.out.println(constructorTest.name);
        System.out.println(constructorTest.age);
    }
}
