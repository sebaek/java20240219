package ch17.lecture.p1stream;

import java.util.List;

public class C07Distinct {
    public static void main(String[] args) {
        List<Integer> list = List.of(6, 2, 3, 6, 0, 3, 0, 1);

        // distinct : 중복값 제거

        long count = list.stream()
                .distinct()
                .count();

        System.out.println("count = " + count);

        list.stream()
                .distinct()
                .forEach(System.out::println);


        System.out.println();
        // 중간 연산들 조합
        List<Integer> list1 = List.of(9, 5, 0, 10, 7, 6, 9, 0, 1, 1);
        list1.stream()
                .distinct()
                .filter(e -> e % 2 == 1)
                .forEach(System.out::println);
    }
}
