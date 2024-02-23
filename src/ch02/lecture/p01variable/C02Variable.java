package ch02.lecture.p01variable;

public class C02Variable {
    public static void main(String[] args) {
        // 변수에 값이 할당되지 않았을 때 사용할 수 없음
        int a;
        a = 3;
        System.out.println(a);

        // 변수 선언과 값 대입을 한 명령문에서 할 수 있음
        int b;
        b = 5;

        int c = 10;

        // 변수 여러개를 한 명령문에서 선언 가능
        int d, e, f;

        // 여러 변수 선언, 값 할당을 한 명령문에서 작성 가능
        int g = 11, h = 12, i = 13;

        // 다른 변수의 값을 대입하는 것 가능;
        int j = 14;
        int k = j;


    }
}
