package ch17.lecture.p1stream;

import java.util.Comparator;
import java.util.List;

public class C10Limit {
    public static void main(String[] args) {
        // limit : 주어진 수 만큼의 요소의 스트림을 리턴
        List<Integer> list = List.of(8, 2, 5, 1, 10, 9, 2, 1, 0);

        list.stream()
                .limit(5)
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .sorted()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .sorted((a, b) -> b - a)
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        // skip : 정해진 갯수만큼의 요소 건너뛰기
        System.out.println(list);
        list.stream()
                .skip(3)
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .sorted()
                .distinct()
                .limit(2)
                .skip(1)
                .forEach(System.out::println);

        list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(2)
                .limit(1)
                .forEach(System.out::println);


    }
}
