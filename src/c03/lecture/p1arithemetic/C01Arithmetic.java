package c03.lecture.p1arithemetic;

public class C01Arithmetic {
    public static void main(String[] args) {
        // 산술 연산자
        // +, -, *, /, %
        // 피연산자 갯수 : 2개
        // 피연산자 : numeric(정수, 실수, 문자)
        // 연산결과의 타입 : 피연산자 중 큰타입

        int a = 3;
        int b = 9;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(b / a);
        System.out.println(b % a); // b를 a로 나눈 나머지

    }
}
