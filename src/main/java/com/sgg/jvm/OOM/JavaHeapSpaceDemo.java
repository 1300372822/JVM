package com.sgg.jvm.OOM;

public class JavaHeapSpaceDemo {

    public static void main(String[] args) {
        byte[] bytes = new byte[10*1024*1024];//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

    }
}
