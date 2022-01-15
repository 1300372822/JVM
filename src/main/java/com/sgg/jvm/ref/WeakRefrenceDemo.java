package com.sgg.jvm.ref;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class WeakRefrenceDemo {
    public static void main(String[] args) {
        Object o1 = new Object();
        WeakReference<Object> weakReference = new WeakReference<>(o1);
        System.out.println("GC前");
        System.out.println(o1);
        System.out.println(weakReference.get());
        o1 = null;
//        weakReference=null;
        System.gc();
        System.out.println("GC后");
        System.out.println(o1);
        System.out.println(weakReference.get());
    }
}
