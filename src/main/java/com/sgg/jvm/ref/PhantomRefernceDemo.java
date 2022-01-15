package com.sgg.jvm.ref;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * java提供了4中引用类型，在垃圾回收的时候，都有各自的特点
 * ReferenceQueue是配合虚引用来工作的，没有ReferenceQueue也可以运行
 * 创建引用的时候可以指定关联的队列，当GC释放对象内存的时候，会将引用加入到引用队列
 * 如果程序发现某个虚引用已经被加入到引用队列 那么就可以在所引用对象的内存被回收之前采取系必要的行动
 * 这相当是一种通知机制
 * 当关联的引用队列中有数据的时候，意味着引用指向的堆内存中的对象被回收，通过这种方式，JVM允许我们在对象被销毁后，做一些我们自己的事情
 */
public class PhantomRefernceDemo {

    public static void main(String[] args) throws InterruptedException {
        Object o1 = new Object();
        ReferenceQueue queue = new ReferenceQueue();
        PhantomReference<Object> phantomReference = new PhantomReference<>(o1,queue);

        System.out.println(o1);
        System.out.println(phantomReference.get());
        System.out.println(queue.poll());
        System.out.println("=============================");
        o1=null;
        System.gc();
        Thread.sleep(500);

        System.out.println(o1);
        System.out.println(phantomReference.get());
        System.out.println(queue.poll());
    }
}
