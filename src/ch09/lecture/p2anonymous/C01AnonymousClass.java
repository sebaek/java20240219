package ch09.lecture.p2anonymous;

public class C01AnonymousClass {
    public static void main(String[] args) {
//        C01MyClass obj = new C01MyClass();
//        C01MyClass obj = new C01Child();
        // @formatter:off
        // 익명클래스의 객체
        C01MyClass obj = new C01MyClass() {};
    }
}

// @formatter:off
abstract class C01MyClass {}
//class C01Child extends C01MyClass {}
