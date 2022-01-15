package com.sgg.jvm.ref;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

public class SoftReferenceDemo {
    /**
     * 内存够用的时候就保留，不够用就回收
     */
    public static void softRef_Memory_Enough(){
        Object o1 = new Object();
        SoftReference<Object> objectSoftReference = new SoftReference<>(o1);
        System.out.println(o1);
        System.out.println(objectSoftReference.get());

        o1=null;
        System.gc();
        System.out.println(o1);
        System.out.println(objectSoftReference.get());

    }

    /**
     * 修改堆内存大小，查看OOM时GC 软引用对象回收情况
     * -Xms5m -Xmx5m -XX:+PrintGCDetails
     */
    public static void softRef_Memory_notEnough(){
        Object o1 = new Object();
        SoftReference<Object> objectSoftReference = new SoftReference<>(o1);
        System.out.println(o1);
        System.out.println(objectSoftReference.get());

        o1=null;

        try {
            byte[] bytes = new byte[10*1024*1024];
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }finally {
            System.out.println(o1);
            System.out.println(objectSoftReference.get());

        }

    }

    public static void main(String[] args) {
//        softRef_Memory_Enough();
        softRef_Memory_notEnough();
    }
}
