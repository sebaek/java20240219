package ch04.lecture.p1if;

public class C02Else {
    public static void main(String[] args) {
        // else : if의 ()조건이 false일 때 실행되는 코드 블럭을 정의

        boolean condition = false;

        if (condition) {
            System.out.println("statement 1");
            System.out.println("statement 2");
        } else {
            // if의 조건의 false일 때 실행
            System.out.println("statement 3");
            System.out.println("statement 4");
        }
        System.out.println("statement 5");
        System.out.println("statement 6");
    }
}
