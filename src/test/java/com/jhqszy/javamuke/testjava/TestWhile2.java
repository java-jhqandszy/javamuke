package com.jhqszy.javamuke.testjava;

public class TestWhile2 {
    public static void main(String[] args) {

        System.out.println("输出三角形矩阵");
        int m =1;
        int n =1;
        while (m<=5){
            n=1;
            while (n<=m){
                System.out.print("*");
                n++;
            }
            System.out.println("\n");
            m++;
        }
    }
}
