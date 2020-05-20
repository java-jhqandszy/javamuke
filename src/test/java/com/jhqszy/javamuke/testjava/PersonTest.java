package com.jhqszy.javamuke.testjava;


/**
 * 成员变量练习：类变量，实例变量
 */
 class Person {
        public String name;
        public static int eyeNum;
 }

 public class PersonTest{

     public static void main(String[] args) {
        //在第一次使用Person类，则类进行初始化，成员变量进行自动初始化，无需显示初始化，所以eyeNum变量值为0
         System.out.println("Person类的eyeNum变量的值为："+ Person.eyeNum);
         //声明一个Person的实例来访问成员变量
         Person person = new Person();
         System.out.println("person实例的name值为："+ person.name + "person实例的eyeNum值为:"+person.eyeNum);
        //对person实例进行赋值
         person.name = "jiaheqi";
         person.eyeNum = 21;
         System.out.println("赋值后person实例的name值为："+ person.name + "赋值后person实例的eyeNum值为:"+person.eyeNum);
         System.out.println("赋值后Person类的eyeNum变量的值为："+ Person.eyeNum);
         //通过一个新的实例来访问成员变量
         Person person1 = new Person();
         //因为同一个类的所有实例访问类变量时，实际上访问的都是同一个变量，也就是同一片内存区，所以值都一样
         System.out.println("person1实例的name值为："+ person1.name + "person实例的eyeNum值为:"+person1.eyeNum);

     }
 }
