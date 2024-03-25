package ch11.lecture.p1exception;

import java.util.List;

public class C07Finally {
    public static void main(String[] args) {
        // finally
        // : exception 발생 여부와 관계 없이, return을 해도
        // 항상 실행되는 블럭
        try {
//            List.of("a", "b").get(2); // exception 발생
            List.of("a", "b").get(1); // exception 발생 안함

            return;

        } finally {
            System.out.println("무조건 실행");
        }

//        System.out.println("프로그램 종료");

    }
}
