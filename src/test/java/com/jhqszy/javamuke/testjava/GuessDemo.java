package com.jhqszy.javamuke.testjava;

import java.util.Scanner;

public class GuessDemo {

    public static void main(String[] args) {

        int number = (int) (Math.random()*10+1);
        int guess = 0;
        do {
            System.out.println("请输入你的数字");
            Scanner scanner = new Scanner(System.in);
            guess = scanner.nextInt();
            if (guess>number){
                System.out.println("too big ");
            }else {
                System.out.println("too small");
            }

        }while (guess!=number);{
            System.out.println("u r right");
        }


    }
}
