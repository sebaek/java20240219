package ch14.lecture.p2concurrency;

import java.util.concurrent.atomic.AtomicLong;

public class C04Concurrency {
    public static void main(String[] args) throws InterruptedException {
        MyObject4 o = new MyObject4();
        Thread t1 = new Thread(o);
        Thread t2 = new Thread(o);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(o.getValue());
    }
}

class MyObject4 implements Runnable {
    //    private long value;
    private AtomicLong value;

    public MyObject4() {
        this.value = new AtomicLong();
    }

    public long getValue() {
//        return value;
        return value.longValue();
    }

    public void update() {
        for (int i = 0; i < 30000; i++) {
//            value++;
            value.getAndIncrement();
        }
    }

    @Override
    public void run() {
        update();
    }
}
