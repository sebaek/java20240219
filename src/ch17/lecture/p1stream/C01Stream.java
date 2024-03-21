package ch17.lecture.p1stream;

import java.util.List;

public class C01Stream {
    public static void main(String[] args) {
        // Stream API :
        // 컬렉션의 요소들을 반복처리하는 메소드 제공
        // 이 메소드 사용으로 코드를 간결하게 작성할 수 있음

        // 메소드 종류 :
        // 1. 중간 연산 (intermediate operation) :
        //    Stream 객체 리턴
        // 2. 최종 연산 (terminal operation)
        //    Stream 객체 리턴하지 않음

        List<Integer> list = List.of(10, 5, 9, 20, 7, 22, 33, 55, 66);

        int sum = 0;
        for (Integer item : list) {
            if (item % 2 == 1) {
                sum += item;
            }
        }
        System.out.println("sum = " + sum);

        int sum1 = list.stream()
                .filter(a -> a % 2 == 1)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("sum1 = " + sum1);

    }
}
