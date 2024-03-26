package ch14.lecture.p1thread;

public class C07Runnable {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 30000; i++) {
                System.out.println(i);
            }
        });
        for (int i = 0; i < 30000; i++) {
            System.err.println(i);
        }
    }
}
