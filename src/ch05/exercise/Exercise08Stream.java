package ch05.exercise;

import java.util.Arrays;

public class Exercise08Stream {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };


        int sum = Arrays.stream(array)
                .flatMapToInt(r -> Arrays.stream(r))
                .sum();

        double avg = Arrays.stream(array)
                .flatMapToInt(r -> Arrays.stream(r))
                .average()
                .getAsDouble();

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
