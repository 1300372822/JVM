package com.sgg.jvm.OOM;

import java.util.ArrayList;
import java.util.List;

/**
 * jvm参数配置演示
 * -Xms10m -Xmx10m -XX:PrintGCDetails -XX:MaxDirectMemorySize=5m
 *
 * GC回收时间过长会抛出OutofMemoryError。过长的定义是，超过98%的时间用来做GC并且回收了不到2%的堆内存
 * 连续多次都只会收了不到2%的极端情况下才会抛出。假如bu抛出 GC overhead Limit 错误会发生社么情况呢
 * 那就是GC清理的这么点内存很快就会再次填满，迫使GC再次执行，这样就形成恶行循环
 * CPU使用率一直是100%，而GC却没有任何成果
 */
public class GcOverHeadDemo {

    public static void main(String[] args) {
        int i=0;
        List<String> list = new ArrayList<>();
        try {
            while (true){
                ++i;
                String s = Integer.toString(i);
                String.valueOf(i).intern();
                list.add(String.valueOf(++i).intern());
            }
        }catch (Throwable e){
//            java.lang.OutOfMemoryError: GC overhead limit exceeded
            System.out.println("*********************i="+i);
            e.printStackTrace();
            throw e;
        }
    }
}