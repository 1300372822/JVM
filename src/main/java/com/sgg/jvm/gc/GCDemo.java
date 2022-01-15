package com.sgg.jvm.gc;

import java.util.Random;


/**
 * 1.  -Xms5m -Xmx5m -XX:+PrintGCDetails -XX:+UseSerialGC  (DefNew + Tenured)
 * 2.  -Xms5m -Xmx5m -XX:+PrintGCDetails -XX:+UseParNewGC  (ParNew+ Tenured)
 * 3. -Xms5m -Xmx5m -XX:PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseParallelGC(PSYoungGen + ParOldGen)
 * UseParallelOldGC与UseParallelGC可互相激活
 * 4. -Xms5m -Xmx5m -XX:PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseParallelOldGC(PSYoungGen + ParOldGen)
 * 5. -Xms5m -Xmx5m -XX:PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseConcMarkSweepGC(par new generation + concurrent)
 * java8被优化掉了SerialOld
 * 6. -Xms5m -Xmx5m -XX:PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseSerialOldGC
 *
 * 7. -Xms5m -Xmx5m -XX:PrintGCDetails -XX:+PrintCommandLineFlags -XX:+UseG1GC
 *
 *
 * */
public class GCDemo {

    public static void main(String[] args) {
        String str = "www..atguigu.com";
        while (true){
            str += str + new Random().nextInt(88888888)+new Random().nextInt(9999999);
        }

    }
}
