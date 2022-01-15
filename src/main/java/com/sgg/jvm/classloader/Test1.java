package com.sgg.jvm.classloader;

public class Test1 {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(object.getClass().getClassLoader());
//        System.out.println(object.getClass().getClassLoader().getParent());//NullPointerException


        System.out.println();
        System.out.println();
        System.out.println();

        Test1 test1 = new Test1();
        System.out.println(test1.getClass().getClassLoader());
        System.out.println(test1.getClass().getClassLoader().getParent());
        System.out.println(test1.getClass().getClassLoader().getParent().getParent());


    }
}
