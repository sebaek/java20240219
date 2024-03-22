package ch17.lecture.p1stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C16Collectors {
    public static void main(String[] args) {
        List<String> list = List.
                of("java", "css", "html",
                        "spring", "jquery", "c++",
                        "swift", "home", "javascript");

        // 결과 타입 Map<String, List<String>>
        // key: "j", "c", "h", "s"

        Map<String, List<String>> collect =
                list.stream()
                        .collect(Collectors.groupingBy(e -> e.substring(0, 1)));

        System.out.println("collect = " + collect);

    }
}
