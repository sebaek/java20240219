package ch04.lecture.p1if;

public class C01If {
    public static void main(String[] args) {
        // if : 조건문, 분기문(branch)
        // ()괄호의 값이 true이면 {}중괄호(코드블럭)을 실행하고
        //            false이면 실행하지 않음.


        System.out.println("명령문 1");
        if (false) {
            System.out.println("명령문 2");
        }


        if (5 > 3) {
            System.out.println("명령문 3");
            System.out.println("명령문 4");
        }


        if (true && false) {
            System.out.println("명령문 5");
            System.out.println("명령문 6");
        }

    }
}
