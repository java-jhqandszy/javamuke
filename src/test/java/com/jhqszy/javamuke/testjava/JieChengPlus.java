package com.jhqszy.javamuke.testjava;

public class JieChengPlus {

    public static void main(String[] args) {

        System.out.println("计算阶乘");
        int s = 1;
        int sum = 0;
        for(int i =1;i<=10;i++ ){
            s = 1;
            for (int j = 1;j<=i;j++){
                s=s*j;
            }
            sum = sum +s;
        }
        System.out.println("10的阶乘为："+ sum);
    }
}
