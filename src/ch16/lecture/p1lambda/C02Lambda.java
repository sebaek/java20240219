package ch16.lecture.p1lambda;

public class C02Lambda {
    public static void main(String[] args) {
        // 람다식(lambda expression) :
        // Functional Interface (추상메소드가 하나인 인터페이스) 의
        // 익명 클래스의 객체 생성코드를 간단히 한 것

        C02MyInterface obj = (int a, int b) -> {
            System.out.println(a);
            System.out.println(b);
            System.out.println("C02Lambda.method1");
        };
    }
}

// @FunctionalInterface annotation
// : 마크된 인터페이스가 추상 메소드가 하나인지 컴파일러가 검사
@FunctionalInterface
interface C02MyInterface {
    void method1(int a, int b);
}
