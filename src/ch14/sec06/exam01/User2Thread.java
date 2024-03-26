package ch14.sec06.exam01;

public class User2Thread extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        try {
            calculator.setMemory2(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
