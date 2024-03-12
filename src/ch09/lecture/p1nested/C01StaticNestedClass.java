package ch09.lecture.p1nested;

public class C01StaticNestedClass {
    public static void main(String[] args) {
        C01MyClass.C01NestedClass obj1 = new C01MyClass.C01NestedClass();

    }
}

class C01MyClass {
    // 정적(static) 중첩 클래스
    static class C01NestedClass {
    }

    //필드,생성자,메소드
    void method1() {
        C01NestedClass obj1 = new C01NestedClass();
    }
}
