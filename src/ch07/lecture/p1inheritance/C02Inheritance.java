package ch07.lecture.p1inheritance;

public class C02Inheritance {
    public static void main(String[] args) {
        C02Child child1 = new C02Child();
        child1.method1();
        child1.method2();

        C02Child2 child2 = new C02Child2();
        child2.method1();
    }
}

// 부모클래스, 상위클래스, 슈퍼클래스
// parent class, super class
class C02Parent {
    public void method1() {
    }
}

// 자식클래스, 하위클래스, 서브클래스
// child class, subclass
class C02Child extends C02Parent {
    // 메소드 추가 가능
    public void method2() {
    }
}

// 여러 클래스가 상속 받을 수 있음
class C02Child2 extends C02Parent {
}
