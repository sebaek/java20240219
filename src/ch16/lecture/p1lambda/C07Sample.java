package ch16.lecture.p1lambda;

public class C07Sample {
    public static void main(String[] args) {
        // TODO: null 대신 lambda 코드 작성
        C07MyInterface obj1 = str -> System.out.println(str + str + str);
        C07MyInterface obj2 = s -> System.out.println(s + s);
        C07MyInterface obj3 = s -> System.out.println(s.toUpperCase());
        obj1.method("hi"); // "hihihi" 출력
        obj2.method("hello"); // "hellohello" 출력
        obj3.method("spring"); // "SPRING" 출력
    }
}

@FunctionalInterface
interface C07MyInterface {
    void method(String a);
}
