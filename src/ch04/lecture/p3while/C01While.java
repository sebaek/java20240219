package ch04.lecture.p3while;

public class C01While {
    public static void main(String[] args) {
        // while: 반복문 정의
        // {}의 명령문들이 ()괄호의 값이 true이면 실행됨
        // {}명령문 실행 후 다시 ()괄호로 실행흐름 넘어감

        // ()괄호의 값이 false이면 while 다음의 실행흐름으로 넘어감

        boolean condition = true;

        System.out.println("statement 1");
        while (condition) {
            System.out.println("statement 2");
            System.out.println("statement 3");
        }
        System.out.println("statement 4");
    }
}
