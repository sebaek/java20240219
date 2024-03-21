package ch17.exercise.p5;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions");

        list.stream()
                .filter(s -> s.matches(".*[jJ][aA][vV][aA].*"))
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .filter(s -> s.toLowerCase().contains("java"))
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .filter(s -> s.toUpperCase().contains("JAVA"))
                .forEach(System.out::println);


    }
}
