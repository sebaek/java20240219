package ch16.lecture.p1lambda;

public class C04Lambda {
    public static void main(String[] args) {
        C04MyInterface obj1 = (int a, int b) -> {
            System.out.println(a + b);
            System.out.println("메소드 몸체");
        };
        C04MyInterface obj2 = (a, b) -> {
            System.out.println(a * b);
            System.out.println("C04Lambda.main");
        };
        C04MyInterface obj3 = (a, b) -> System.out.println(a / b);

        obj1.method(10, 11);
        obj2.method(9, 3);
        obj3.method(30, 2);
        
    }
}

// 1. 매개변수가 2개 이상 있고 리턴이 없는 추상 메소드
interface C04MyInterface {
    void method(int a, int b);
}


// 2. 매개변수가 1개 있고 리턴이 없는 추상 메소드
// 3. 매개변수가 없고 리턴이 없는 추상 메소드
// 4. 리턴 있는 추상 메소드

