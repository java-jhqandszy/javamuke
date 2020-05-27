package com.jhqszy.javamuke.testjava;


/**
 * 类型转换练习
 */
public class ConversionTest {
    public static void main(String[] args) {
        double d = 3.14;
        long l = (long) d;
        System.out.println(l);
        int in = 7;
        //基本数据类型：数值型和布尔型之间不能转换，编译错误
//        boolean b = (boolean)in;
        Object obj = "hello";
        //obj的编译类型为object与String存在继承关系，所以二者可以进行类型转换
        String object = (String)obj;
        System.out.println(object);
        Object integerObj = Integer.valueOf(8);
        //integerObj编译类型为Object，运行类型为Integer，可以进行强制类型转换，编译正常，但是运行时会报类型转换异常
//        String stringObject = (String)integerObj;
//        if(integerObj instanceof String){
//            String stringObject = (String)integerObj;
//        }
        try{
            String stringObject = (String)integerObj;
        }catch (ClassCastException e){
            System.out.println(e);
        }
    }
}
