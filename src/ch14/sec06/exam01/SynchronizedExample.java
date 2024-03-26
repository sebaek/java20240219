package ch14.sec06.exam01;

public class SynchronizedExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User1Thread t1 = new User1Thread();
        User2Thread t2 = new User2Thread();

        t1.setCalculator(calculator);
        t2.setCalculator(calculator);

        t1.start();
        t2.start();
    }
}
