package com.jhqszy.javamuke.testjava;

import java.util.Scanner;

public class FkjavaUnit4Exercise {

    public void ChengFaBiao() {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                sum = i * j;
                System.out.print(i + "*" + j + "=" + sum);
                if (i == j) {
                    System.out.print("\n");
                } else {
                    System.out.print(", ");
                }
            }

        }
    }
    public void DengYaoSanJiao(){
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        n = scanner.nextInt();
        String[][] strings = new String[n][2*n-1];

        for(int i = 0;i<4;i++){
            for(int j = 0;j<2*n-1;j++){
                 if(j>=(n-1-i)&&j<=(n-1+i)){
                    strings[i][j]="*";

                }else {
                    strings[i][j]=" ";
                }
            }

        }
        for (String[] x:strings){
            for(String y:x){
            System.out.print(y);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        FkjavaUnit4Exercise fkjavaUnit4Exercise = new FkjavaUnit4Exercise();
//        fkjavaUnit4Exercise.ChengFaBiao();
        fkjavaUnit4Exercise.DengYaoSanJiao();

    }

}
