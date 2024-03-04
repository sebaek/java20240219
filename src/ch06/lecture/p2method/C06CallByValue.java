package ch06.lecture.p2method;

public class C06CallByValue {
    public static void main(String[] args) {
        C06Car car = new C06Car();
        car.name = "tesla";
        car.printName();

        C06CarCenter center = new C06CarCenter();
        center.changeName(car);

        car.printName(); // "kia"? "tesla"?
    }
}

class C06CarCenter {
    void changeName(C06Car car) {
        car = new C06Car(); //
        car.name = "kia";
    }
}

class C06Car {
    String name;

    void printName() {
        System.out.println(name);
    }
}
