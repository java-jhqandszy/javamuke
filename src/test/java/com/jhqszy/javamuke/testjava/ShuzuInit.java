package com.jhqszy.javamuke.testjava;

public class ShuzuInit {

    public static void main(String[] args) {
        //1.静态初始化方式一：数组元素类型与new关键字后面类型一致
        int[] arrint ;
        arrint = new int[]{1,2,3};
        //2.静态初始化方式二：new后关键字类型是声明时的类型的子类，如string是pbject子类
        Object[] arrstring;
        arrstring = new String[]{"haha","hehe","enen"};
        //3.静态初始化方式三：数组元素类型是new关键字后面类型的子类，如：string是object子类
        Object[] arrstring2;
        arrstring2 = new Object[]{"apple","banana"};
        //4.静态初始化简化方式：声明和初始化同时完成
        int[] arrint2 = new int[]{7,7};
        //5.静态初始化简化方式：声明和初始化同时完成的简写
        int[] arrint3 = {8,8};
        //6.动态初始化方式：只指定数组长度，系统分配默认初始值
        int[] prices = new int[5];
    }
}
