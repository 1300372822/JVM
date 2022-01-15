package com.sgg.jvm.classloader;

public class Test2 {
    public static void main(String[] args) {
        final int i =0;
//        i=1;
        String s= "aa";
        s="bb";
        Thread thread = new Thread();
        thread.start();
//        thread.start();
        try {
            main(null);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
