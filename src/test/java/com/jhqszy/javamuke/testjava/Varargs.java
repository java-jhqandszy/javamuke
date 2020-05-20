package com.jhqszy.javamuke.testjava;

/**
 * 个数可变的形参练习
 */
public class Varargs {

    //1、形式一
    public static void test(int a, String...books){
        for (String tmp:books){
            System.out.println(tmp);
        }
        System.out.println(a);

    }
    //2、形式二
    public static void test2(int b, String[] fruits){
        for(String m:fruits){
            System.out.println(m);
        }
        System.out.println(b);
    }
    public static void main(String[] args) {
        test(7,"hahaha","xixixi");
        //形参如果是数组，则实参也必须是数组
        test2(8, new String[]{"apple","banana"});
    }
}
