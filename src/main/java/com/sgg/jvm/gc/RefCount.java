package com.sgg.jvm.gc;

public class RefCount {

    private byte[] bigSize = new byte[2*1024*1024];
    Object instace = null;
    public static void main(String[] args) {
        RefCount refCountA = new RefCount();
        RefCount refCountB = new RefCount();
        refCountA.instace = refCountB;
        refCountB.instace = refCountA;
        refCountA = null;
        refCountB = null;

        System.gc();//手动GC
    }
}
