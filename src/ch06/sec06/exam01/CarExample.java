package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

//        myCar.model = "tesla";

        // 필드에 값을 넣지 않으면
        // 0, false, null
        // 책 214쪽 표

        System.out.println("myCar.model = " + myCar.model);
        System.out.println("myCar.start = " + myCar.start);
        System.out.println("myCar.speed = " + myCar.speed);

    }
}
