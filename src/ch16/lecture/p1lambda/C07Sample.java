package ch16.lecture.p1lambda;

public class C07Sample {
    public static void main(String[] args) {
        // TODO: null 대신 lambda 코드 작성
        C07MyInterface obj1 = null;
        C07MyInterface obj2 = null;
        C07MyInterface obj3 = null;
        obj1.method("hi"); // "hihihi"
        obj2.method("hello"); // "hellohello"
        obj3.method("spring"); // "SPRING"
    }
}

@FunctionalInterface
interface C07MyInterface {
    void method(String a);
}
