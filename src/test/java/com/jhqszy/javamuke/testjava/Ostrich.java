package com.jhqszy.javamuke.testjava;


/**
 * 方法重写和super限定
 */
 class Bird {
     public int weight = 1;
    public void fly(){
        System.out.println("我可以飞");
    }
}


public class Ostrich extends Bird{
     //子类中有和父类一样的实例变量，想要访问父类中的实例变量，需要用super
     public int weight = 2;
     //对父类方法的重写
     public void fly(){
         System.out.println("我只会跑，不会飞");

     }
     //如果想调用父类中被重写方法，则可以通过在子类中新写一个方法间接调用
     public void callOverridedMethod(){
         //super关键字调用父类被覆盖方法
         super.fly();
     }
     public void accessSon(){
         System.out.println(weight);

     }
     public void accessFather(){
         System.out.println(super.weight);
     }

    public static void main(String[] args) {
        Ostrich os = new Ostrich();
        os.accessSon();
        os.accessFather();
        os.fly();
        os.callOverridedMethod();
    }
}
