package com.jhqszy.javamuke.testjava;

/**
 * 练习this引用
 */

public class Dog {

    public void jump(){
        System.out.println("狗狗在跳");

    }

    public void run(){
//        注释代码可以替换为this.jump()
//        Dog d = new Dog();
//        d.jump();
        this.jump();
        System.out.println("狗狗在跑");
    }

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.run();
    }
}
