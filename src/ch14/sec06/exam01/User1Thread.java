package ch14.sec06.exam01;

public class User1Thread extends Thread {
    public Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        try {
            calculator.setMemory1(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
