package ch04.lecture.p5break;

public class C01Break {
    public static void main(String[] args) {
        // for, while, do-while
        // break : 반복문의 코드 블럭에서 break 실행시 반복문 종료

        boolean b = true;

        while (b) {
            System.out.println("statement 1");
            System.out.println("statement 2");
            System.out.println("statement 3");

            break;
        }

        System.out.println("statement 4");
    }
}
