package com.jhqszy.javamuke.testjava;

/**
 * 构造器重载和嵌套练习
 */
public class ConstructorOverloadTest {
    public String name;
    public double height;
    public double weight;
    public String sex;
    public ConstructorOverloadTest(){}
    public ConstructorOverloadTest(String name,double height,double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;

    }
    public ConstructorOverloadTest(String name,double height,double weight,String sex){
        //构造器的嵌套
        this(name,height,weight);
        this.sex = sex;
    }

    public static void main(String[] args) {
        ConstructorOverloadTest cot1 = new ConstructorOverloadTest();
        ConstructorOverloadTest cot2 = new ConstructorOverloadTest("小明",178.00,60.00);
        ConstructorOverloadTest cot3 = new ConstructorOverloadTest("小明",178.00,60.00,"男");
        System.out.println("构造器2的输出："+ cot2.name + cot2.height + cot2.weight);
        System.out.println("构造器3的输出："+ cot3.name + cot3.height + cot3.weight +cot3.sex);

    }
}
