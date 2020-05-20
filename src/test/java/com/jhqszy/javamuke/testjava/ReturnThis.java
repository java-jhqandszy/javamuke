package com.jhqszy.javamuke.testjava;

public class ReturnThis {
    public int age;
    public ReturnThis grow(){
        age++;
        //this作为返回值，返回调用当前方法的对象
        return this;
    }

    public static void main(String[] args) {
        ReturnThis returnThis = new ReturnThis();
        //grow方法中将this作为返回值，所以可以连续多次调用grow，从而使代码简洁，但是可能会造成实际意义的模糊
        returnThis.grow().grow().grow();
        System.out.println("returnThis的成员变量age的值为"+returnThis.age);
    }
}
