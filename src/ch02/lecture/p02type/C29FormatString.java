package ch02.lecture.p02type;

import static java.util.FormatProcessor.FMT;

public class C29FormatString {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s%n", 1, name, job);

        System.out.println(STR."\{1} | \{name} | \{job}");

        // FMT Template Processor
        System.out.println(FMT."%6d\{1} | %-10s\{name} | %10s\{job}");

    }
}
