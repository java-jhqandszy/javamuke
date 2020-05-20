package com.jhqszy.javamuke.testjava;


/**
 * 方法重载的练习
 */
public class OverLoad {

    public void test(){
        System.out.println("没有参数的方法");
    }
    public void test(String msg){
        System.out.println("有一个String形参的方法" + msg);
    }
    public void testtest(String ...books){
        System.out.println("可变参数的方法");
    }
    public void testtest(String message){
        System.out.println("有一个String形参的方法2" + message);
    }

    public static void main(String[] args) {
        OverLoad overLoad = new OverLoad();
        //调用无参test方法
        overLoad.test();
        //调用有一个参数的test方法
        overLoad.test("haha");
        //调用可变形参方法
        overLoad.testtest();
        //调用有一个String形参的方法2
        overLoad.testtest("hqqqqqq");
        //调用可变形参方法
        overLoad.testtest(new String[]{"book1","book2"});
        //调用可变形参的方法
        overLoad.testtest("aa","bb");
    }

}
