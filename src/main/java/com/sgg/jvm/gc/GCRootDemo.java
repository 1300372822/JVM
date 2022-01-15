package com.sgg.jvm.gc;


/**
 * java中的GC Roots的对象有
 * 1.虚拟机栈中（栈帧中的局部变量表）的对象
 * 2.方法区中的类静态属性引用的对象
 * 3.方法区中常量池引用的对象
 * 4.本地方法栈中JNI（一般说的Native方法）中引用的对象
 */
public class GCRootDemo {

    private byte[] byteArray =  new byte[100*1024*1024];
    private static GCRootDemo2 demo2;
    private final static GCRootDemo3 demo3=new GCRootDemo3();
    private static void m1(){
        GCRootDemo gcRootDemo = new GCRootDemo();
        System.gc();
        System.out.println("第一次GC完成");
    }

    public static void main(String[] args) {
        m1();
    }
}
