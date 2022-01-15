package com.sgg.jvm.OOM;

import java.nio.ByteBuffer;

public class DirectBufferMemoryDemo {
    public static void main(String[] args) {
        System.out.printf("配置的maxDirectMemory："+
                (sun.misc.VM.maxDirectMemory()/(double)1024/1024)+"MB");

        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(6*1024*1024);
    }
}
