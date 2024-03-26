package ch15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;

public class SynchronizedMapExample {
    public static void main(String[] args) throws InterruptedException {
//        var map = Collections.synchronizedMap(new HashMap<Integer, String>());
//        var map = new HashMap<Integer, String>();
        var map = new Hashtable<Integer, String>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "내용" + i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "내용" + i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("map.size() = " + map.size());
    }
}
