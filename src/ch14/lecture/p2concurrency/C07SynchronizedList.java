package ch14.lecture.p2concurrency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07SynchronizedList {
    public static void main(String[] args) throws InterruptedException {
//        List<String> list = new ArrayList<>();
        List<String> list = Collections.synchronizedList(new ArrayList<>());

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 30000; i++) {
                list.add("a");
                list.remove("a");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 30000; i++) {
                list.add("b");
                list.remove("b");
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(list);
    }
}
