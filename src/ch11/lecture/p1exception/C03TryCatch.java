package ch11.lecture.p1exception;

import java.util.List;

public class C03TryCatch {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");

        String s1 = list.get(0); // exception 발생안함

        try {
            System.out.println("exception 발생 전 실행 코드...");
            // try : exception 발생할 수 있는 코드를 감싼 블럭
            // exception 발생함
            String s2 = list.get(2);

            System.out.println("exception 이 발생하지 않았으면 ");
            System.out.println("실행되는 코드들....");
        } catch (IndexOutOfBoundsException e) {
            // catch : 발생한 exception을 잡고 처리하는 코드 블럭
            System.out.println("exception 발생 후 실행되는 코드들...");
        }

        System.out.println("나머지 코드들...");
    }
}
