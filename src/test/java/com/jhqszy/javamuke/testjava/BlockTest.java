package com.jhqszy.javamuke.testjava;

/**
 * 代码块局部变量练习
 */
public class BlockTest {

    public static void main(String[] args) {
        {
            int a;
            //局部变量a未初始化，无法打印输出，直接报错
//            System.out.println("局部变量a的值为："+ a);
            a = 5;
            System.out.println("局部变量a的值为："+ a);
        }
        //访问的a找不到，因为：只要离开了局部变量所在的代码块，这个局部变量就立即被销毁
//        System.out.println("局部变量a的值为："+ a);
    }
}
