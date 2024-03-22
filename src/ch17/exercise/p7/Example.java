package ch17.exercise.p7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = List.of(new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자"));

        List<Member> developers = list.stream()
                .filter(m -> m.getJob().equals("개발자"))
                .collect(Collectors.toList());

        developers.stream()
                .forEach(d -> System.out.println(d.getName()));
    }
}
