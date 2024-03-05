package ch06.sec08.exam03;

public class Car {

    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }

    void run() {
        // gas가 0 보다 큰 동안 gas를 1씩 줄임

        while (true) {
            if (gas > 0) {
                System.out.println("달립니다. (gas잔량: " + gas + ")");
                gas--;
            } else {
                System.out.println("멈춥니다. (gas잔량: " + gas + ")");
                return;
            }
        }
    }
}
