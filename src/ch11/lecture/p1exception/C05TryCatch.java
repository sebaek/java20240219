package ch11.lecture.p1exception;

import java.util.List;

public class C05TryCatch {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");

        try {
            for (int i = 0; i <= list.size(); i++) {
                System.out.println("list.get(i) = " + list.get(i));
            }
            System.out.println("모든 원소 출력됨!");

        } catch (IndexOutOfBoundsException e) {
            // 어떤 exception 발생했는 지 출력
//            System.err.println("예외 발생");
            e.printStackTrace(); // 별일 없으면 catch 에서 꼭 작성
        }
        System.out.println("나머지 코드들...");
    }
}
