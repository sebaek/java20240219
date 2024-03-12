package ch09.lecture.p1nested;

public class C02InstanceNestedClass {
    public static void main(String[] args) {

        C02MyClass obj1 = new C02MyClass();
        C02MyClass.C02NestedClass obj = obj1.new C02NestedClass();

    }
}

class C02MyClass {
    // 인스턴스 중첩 클래스 (nested class)
    class C02NestedClass {
        //필드
        //생성자
        // 메소드
    }

    // 필드
    // 생성자
    // 메소드
    void method1() {
        C02NestedClass obj1 = new C02NestedClass();
    }
}