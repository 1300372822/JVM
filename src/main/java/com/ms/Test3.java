package com.ms;

import java.util.*;

public class Test3 {
    
    public static void main(String[] args) {
        test("In school and life, the most important driving force of work is the pleasure in work, the pleasure of working as a result, and the recognition of the social value of this result");
    }
    public static void test(String str){
        String[] array = str.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }
            else {
                map.put(array[i],1);
            }
        }
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        List<Integer> list = new ArrayList<>();
        while (iterator.hasNext()){
            String next = iterator.next();
            list.add(map.get(next));
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, Integer> next = iterator1.next();
            if (list.get(0)==next.getValue()||list.get(1)==next.getValue()||list.get(2)==next.getValue()){
                System.out.println(next.getKey()+"="+next.getValue());
            }
        }
    }
    
    
}
