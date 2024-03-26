package ch14.lecture.p1thread;

public class C02Thread {
    public static void main(String[] args) {
        C02Thread1 thread1 = new C02Thread1();
        C02Thread2 thread2 = new C02Thread2();

        thread1.start();
        thread2.start();
    }
}

class C02Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30000; i++) {
            System.out.println(i);
        }
    }
}

class C02Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30000; i++) {
            System.err.println(i);
        }
    }
}
