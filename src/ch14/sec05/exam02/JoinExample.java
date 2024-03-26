package ch14.sec05.exam02;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        SumThread sumThread = new SumThread();
        sumThread.start();

        sumThread.join(); // sumThread 가 종료되기를 기다림

        System.out.println(sumThread.getSum());
    }
}
