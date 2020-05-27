package com.jhqszy.javamuke.testjava;


class Base{
    public void test(){
        System.out.println("父类中将要被子类重写的方法");
    }
    public  Base(){
        test();
    }
}

public class Sub extends Base {
    private String name;
    public void test(){
        System.out.println("子类重写后的方法"+"name字符串的长度"+ name.length());
    }

    public static void main(String[] args) {
        Sub s = new Sub();
    }
}
