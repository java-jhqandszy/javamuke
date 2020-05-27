package com.jhqszy.javamuke.testjava;


/**
 * 多态
 */
class BaseClass{
      public  int book = 6;
      public void base(){
          System.out.println("父类中的普通方法");
      }
      public void test(){
          System.out.println("父类中的被覆盖的test方法");
      }
}

public class SubClass extends BaseClass {
    public String book = "夏至未至";
    public void sub(){
        System.out.println("子类中的普通方法");
    }
    public void test(){
        System.out.println("子类中用来覆盖父类的test方法");
    }

    public static void main(String[] args) {
        BaseClass bc = new BaseClass();
        System.out.println("编译类型运行类型均为父类，调用父类变量："+bc.book);
        //调用当前类的test方法
        bc.test();
        //调用父类普通方法
        bc.base();
        SubClass sc = new SubClass();
        System.out.println("编译类型运行类型均为子类，调用子类变量："+sc.book);
        //调用子类test方法
        sc.test();
        //调用子类普通方法
        sc.sub();
        BaseClass bcsc = new SubClass();
        System.out.println("编译类型和运行类型不一致"+bcsc.book);
        bcsc.base();
        bcsc.test();
        //因为只能调用编译类型下的方法，所以无法调用运行类型下的sub方法，如果需要需要转型
//        bcsc.sub();
        ((SubClass) bcsc).sub();
    }
}
