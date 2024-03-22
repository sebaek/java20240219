package ch17.lecture.p1stream;

import java.util.ArrayList;
import java.util.List;

public class C13Collect {
    public static void main(String[] args) {
        List<String> list
                = List.of("java", "spring", "css", "html", "react");

        List<Integer> result1 = new ArrayList<>();
        for (String s : list) {
            result1.add(s.length());
        }

        System.out.println(result1); // [4, 6, 3, 4, 5]

        List<Integer> result2 = list.stream()
                .collect(() -> new ArrayList<Integer>(),
                        (c, e) -> c.add(e.length()),
                        (a, b) -> a.addAll(b));

        System.out.println("result2 = " + result2);
    }
}
