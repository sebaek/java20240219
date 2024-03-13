package ch16.lecture.p1lambda;

public class C05Sample {
    public static void main(String[] args) {
        // TODO : null 이 있는 곳에 lambda 로 코드 작성해 보기
        C05MyInterface obj1 = (x, y) -> System.out.println(x / y);
        C05MyInterface obj2 = (num1, num2) -> System.out.println(num1 % num2);
        obj1.method(5, 3); // 5를 3으로 나눈 몫 출력
        obj2.method(5, 3); // 5를 3으로 나눈 후의 나머지 출력
    }
}

@FunctionalInterface
interface C05MyInterface {
    void method(int a, int b);
}
