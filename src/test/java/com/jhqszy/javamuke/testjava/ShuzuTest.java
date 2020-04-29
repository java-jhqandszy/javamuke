package com.jhqszy.javamuke.testjava;

import java.util.Scanner;

public class ShuzuTest {

    public static void main(String[] args) {

        int[]arrays  = new int[5];
        int sum = 0;
        //输入数据作为数组元素，并存储
        for (int i = 0;i<arrays.length;i++){
            System.out.println("请输入一个数字");
            Scanner scanner = new Scanner(System.in);
            arrays[i] = scanner.nextInt();
        }
        //for each遍历输出数组元素
        for (int m :arrays){
            System.out.print(m +" ");
        }
        //求数组织和
        for (int j = 0;j<arrays.length;j++){
            sum = sum+arrays[j];
        }
        System.out.println("数组的和是："+sum);
    }
}
