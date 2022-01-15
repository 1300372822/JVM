package com.sgg.jvm.OOM;

public class StackOverFlowErrorDemo {

    public static void main(String[] args) {
        stackOverflowError();
    }

    private static void stackOverflowError() {
        stackOverflowError(); //Exception in thread "main" java.lang.StackOverflowError
    }
}
