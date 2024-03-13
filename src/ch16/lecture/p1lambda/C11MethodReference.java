package ch16.lecture.p1lambda;

// 메소드 참조
//   1. static method 참조
//   2. instance method 참조
//   3. 임의 객체의 인스턴스 메소드 참조

// 4. 생성자 참조


//   1. static method 참조
public class C11MethodReference {
    public static void main(String[] args) {
        C11MyInterface obj1 = (param1, param2) -> staticMethod(param1, param2);
        C11MyInterface obj2 = C11MethodReference::staticMethod;
    }

    static void staticMethod(String x, int y) {
        System.out.println(x + y);
    }
}

@FunctionalInterface
interface C11MyInterface {
    void method(String a, int b);
}



