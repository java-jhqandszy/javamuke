package com.jhqszy.javamuke.testjava;


/**
 * 自动装箱、拆箱练习
 * 基本数据类型和字符串之间的转换
 */
public class AutoBoxingUnBoxing {

    public static void main(String[] args) {
        //自动装箱：把基本数据类型直接赋值给引用数据类型
        Integer intObj = 5;
        //自动拆箱：把引用数据类型直接赋值给基本数据类型
        int it = intObj;
        //把boolean类型的值赋值给Object对象
        Object boolObj = true;

        if(boolObj instanceof Boolean){
            //Object转换为Boolean向下转型，需要强制转换
            boolean b = (boolean) boolObj;
            System.out.println(b);
        }


        String intStr = "123";
        int it1 = Integer.valueOf(intStr);
        int it2 = Integer.parseInt(intStr);
        System.out.println("字符串转换为整型"+it2);
        String floatStr = "3.77";
        float ft1 = Float.valueOf(floatStr);
        float ft2 = Float.parseFloat(floatStr);
        System.out.println("字符串转为浮点型"+ft2);

        String FtStr = String.valueOf(1.23f);
        System.out.println("浮点型转换为字符串类型"+FtStr);
        String dbStr = String.valueOf(5.66d);
        System.out.println("double转换为字符串类型"+dbStr);
        String booStr = String.valueOf(true);
        System.out.println("boolean转为字符串类型"+booStr);

        String intintStr = 5+"";
        System.out.println("基本数据类型转换为字符串的简单方式"+intintStr);


    }
}
