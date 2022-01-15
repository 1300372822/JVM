package com.sgg.jvm.heap;

public class HeapSize {
    public static void main(String[] args) {
        long maxMemory = Runtime.getRuntime().maxMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        double v = maxMemory / (double) 1024 / 1024;
        double v2 = totalMemory / (double) 1024 / 1024;
        System.out.println("-Xmx:"+maxMemory+"（字节） "+v+"MB");
        System.out.println("-Xms:"+totalMemory+"(字节) "+v2+"MB");

        //cpu核数
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
