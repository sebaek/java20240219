package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);


        OptionalDouble average = list.stream() // Stream<Integer>
                .mapToInt(Integer::intValue) // IntStream
                .average();

        if (average.isPresent()) {
            System.out.println("평균: " + average.getAsDouble());
        } else {
            System.out.println("평균: 0.0");
        }

        double avg2 = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("평균 : " + avg2);

        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(d -> System.out.println("평균 : " + d));

    }
}
