package com.jhqszy.javamuke.testjava;

class DataWrap{
    int a;
    int b;
}

public class ReferenceTransferTest {
    public static void swap(DataWrap dataWrap){
        int tmp;
        tmp = dataWrap.a;
        dataWrap.a = dataWrap.b;
        dataWrap.b = tmp;
        System.out.println("swap方法里a的值是："+dataWrap.a+"swap方法里b的值是："+dataWrap.b);
    }

    public static void main(String[] args) {
        DataWrap dw = new DataWrap();
        dw.a = 6;
        dw.b = 9;
        ReferenceTransferTest.swap(dw);
        System.out.println("main方法里a的值是："+dw.a+"main方法里b的值是："+dw.b);
    }

}
