package com.sgg.jvm.ref;

public class StrongReferenceDemo {
    public static void main(String[] args) {
        Object o = new Object(); //这样定义的默认就是强引用
        Object obj2= o;
        o= null;
        System.gc();
        System.out.println(o);
        //强引用不会被垃圾回收
        System.out.println(obj2);
    }
}
