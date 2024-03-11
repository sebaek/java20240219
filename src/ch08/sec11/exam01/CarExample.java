package ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.run();

        car.tire1 = new HankookTire();
        car.tire2 = new KumhoTire();

        car.run();
    }
}
