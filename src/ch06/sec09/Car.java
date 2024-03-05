package ch06.sec09;

public class Car {
    String model;
    int speed;

    public Car(String model) {
        this.model = model;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        this.setSpeed(100);
        System.out.println(STR."\{this.model} 가 달립니다.(시속: \{this.speed} km/h)");
    }
}
