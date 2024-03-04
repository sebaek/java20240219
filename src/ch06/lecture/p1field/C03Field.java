package ch06.lecture.p1field;

import com.sun.security.jgss.GSSUtil;

public class C03Field {
    public static void main(String[] args) {
        C03Car car1 = new C03Car();
        System.out.println(car1.color);
        System.out.println(car1.price);

        C03Car car2 = new C03Car();
        System.out.println(car2.color);
        System.out.println(car2.price);

        car2.color = "red";
        car2.price = 5000;

        System.out.println(car1.color);
        System.out.println(car1.price);
        System.out.println(car2.color);
        System.out.println(car2.price);
    }
}

// 클래스는 보통 다른 파일에 작성되지만
// 강의편의상 한 파일 작성함
class C03Car {
    String color = "black";
    int price = 3000;
}
