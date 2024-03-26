package ch14.lecture.p1thread;

public class C05Runnable {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread5());
        t.start();

        for (int i = 0; i < 30000; i++) {
            System.err.println(i);
        }
    }
}

// Thread 생성 방법
// 2. Runnable 인터페이스 구현
//    run 메소드 재정의
class MyThread5 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 30000; i++) {
            System.out.println(i);
        }
    }
}
