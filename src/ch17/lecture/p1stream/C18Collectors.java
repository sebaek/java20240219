package ch17.lecture.p1stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C18Collectors {
    public static void main(String[] args) {
        // 16번 파일에서 복사해옴
        List<String> list = List.
                of("java", "css", "html",
                        "spring", "jquery", "c++",
                        "swift", "home", "javascript");

        // Map<String, Long>
        // {"j":3, "c":2, "h":2, "s":2}

        Map<String, Long> collect =
                list.stream()
                        .collect(Collectors.groupingBy(s -> s.substring(0, 1),
                                Collectors.counting()));

        System.out.println("collect = " + collect);
    }
}
