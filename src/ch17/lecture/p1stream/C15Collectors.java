package ch17.lecture.p1stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C15Collectors {
    public static void main(String[] args) {
        List<String> list
                = List.of("손흥민-토트넘", "이강인-파리", "오타니-LA");

        // {손흥민:토트넘, 이강인:파리, 오타니:LA}
        Map<String, String> collect = list.stream()
                .collect(Collectors.toMap(e -> e.split("-")[0],
                        e -> e.split("-")[1]));

        System.out.println("collect = " + collect);
    }
}
