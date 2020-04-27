package com.jhqszy.javamuke.testjava;

public class TestWhile1 {

    public static void main(String[] args) {

        System.out.println("输出长方形*矩阵");

        int m = 1;
        int n =1;
        //用于判断是否再换行
        while (m<=5){
            //换行之后需要对n进行重新赋值为1，冲一个*开始输入，否则只会输入一行
            n=1;
            //用于判断是否再输入*号
            while (n<=5){
                System.out.print("*");
                n++;
            }
            System.out.println("\n");
            m++;
        }
    }
}
