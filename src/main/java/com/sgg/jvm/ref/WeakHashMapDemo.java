package com.sgg.jvm.ref;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
//        myHashmap();
        myWeakhashmap();
    }
    public static void myWeakhashmap(){
        WeakHashMap<Integer,String> map = new WeakHashMap<>();
        Integer key = new Integer(1);
        String value = "HashMap";
        map.put(key,value);
        System.out.println(map);
        key=null;
        System.out.println(map);
        System.gc();
        System.out.println(map);
    }
    private static void myHashmap(){
        HashMap<Integer,String> map = new HashMap<>();
        Integer key = new Integer(1);
        String value = "HashMap";
        map.put(key,value);
        System.out.println(map);
        key=null;
        System.out.println(map);
        System.gc();
        System.out.println(map);
    }
}
