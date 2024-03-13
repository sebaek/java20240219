package ch16.lecture.p1lambda;

public class C06Lambda {
    public static void main(String[] args) {
        C06MyInterface obj1 = (a) -> {
            System.out.println(a);
            System.out.println("C06Lambda.main");
        };

        C06MyInterface obj2 = a -> {
            System.out.println(a);
            System.out.println("C06Lambda.main");
        };

        C06MyInterface obj3 = a -> System.out.println(a);
        C06MyInterface obj4 = num -> System.out.println(num);

    }
}

// 1. 매개변수가 2개 이상 있고 리턴이 없는 추상 메소드
// 2. 매개변수가 1개 있고 리턴이 없는 추상 메소드
@FunctionalInterface
interface C06MyInterface {
    void method(int a);
}

// 3. 매개변수가 없고 리턴이 없는 추상 메소드
// 4. 리턴 있는 추상 메소드