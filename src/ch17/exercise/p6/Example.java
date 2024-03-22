package ch17.exercise.p6;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> members = List.of(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26));

        double avg = members.stream()
                .mapToInt(Member::getAge)
                .average()
                .orElse(0);

        System.out.println("avg = " + avg);
    }
}
