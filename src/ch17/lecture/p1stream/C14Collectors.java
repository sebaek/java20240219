package ch17.lecture.p1stream;

import java.util.List;
import java.util.stream.Collectors;

public class C14Collectors {
    public static void main(String[] args) {
        List<String> list = List.of("java", "css", "spring", "html");

        String collect = list.stream()
                .collect(Collectors.joining());
        System.out.println("collect = " + collect);

        String collect1 = list.stream()
                .collect(Collectors.joining("-"));
        System.out.println("collect1 = " + collect1);

    }
}
