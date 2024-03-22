package ch17.lecture.p1stream;

import java.util.List;
import java.util.stream.Collectors;

public class C17Collectors {
    public static void main(String[] args) {
        List<String> list
                = List.of("java", "spring", "son", "lee", "otani");

        Long collect = list.stream()
                .collect(Collectors.counting());

        System.out.println("collect = " + collect);
    }
}
