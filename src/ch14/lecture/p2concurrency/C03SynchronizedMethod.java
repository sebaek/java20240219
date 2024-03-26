package ch14.lecture.p2concurrency;

public class C03SynchronizedMethod {
    public static void main(String[] args) throws InterruptedException {
        MyOjbect3 o = new MyOjbect3();
        Thread t1 = new Thread(o);
        Thread t2 = new Thread(o);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("o.getValue() = " + o.getValue());
    }
}

class MyOjbect3 implements Runnable {
    private long value;

    public long getValue() {
        return value;
    }

    public synchronized void update() {
        for (int i = 0; i < 30000; i++) {
            value++;
        }
    }

    @Override
    public void run() {
        update();
    }
}

