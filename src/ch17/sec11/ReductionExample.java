package ch17.sec11;

import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> list = List.of(new Student("홍길동", 92),
                new Student("신용권", 95),
                new Student("감자바", 88));

        int sum1 = list.stream()
                .mapToInt(Student::getScore)
                .sum();
        System.out.println("sum1 = " + sum1);

        Integer sum2 = list.stream()
                .map(Student::getScore)
                .reduce(0, (a, b) -> a + b);

        System.out.println("sum2 = " + sum2);

    }
}
