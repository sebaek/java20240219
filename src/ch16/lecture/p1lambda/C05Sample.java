package ch16.lecture.p1lambda;

public class C05Sample {
    public static void main(String[] args) {
        // TODO : null 이 있는 곳에 lambda 로 코드 작성해 보기
        C05MyInterface obj1 = null;
        C05MyInterface obj2 = null;
        obj1.method(5, 3); // 5를 3으로 나눈 몫 출력
        obj2.method(5, 3); // 5를 3으로 나눈 후의 나머지 출력
    }
}

@FunctionalInterface
interface C05MyInterface {
    void method(int a, int b);
}
