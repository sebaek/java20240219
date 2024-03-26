package ch14.lecture.p1thread;

public class C01Thread {
    public static void main(String[] args) {
        // Thread : 한 프로세스 내의 하나의 업무 흐름 단위

        for (int i = 0; i < 30000; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 30000; i++) {
            System.err.println(i);
        }
    }
}
