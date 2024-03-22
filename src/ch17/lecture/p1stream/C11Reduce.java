package ch17.lecture.p1stream;

import java.util.List;

public class C11Reduce {
    public static void main(String[] args) {
        // reduce : reduction 최종 연산

        List<String> list = List.of("java", "css", "spring", "html");

        // "javacssspringhtml"
        String result1 = ""; // 초기값
        for (String s : list) {
            result1 += s; // apply
        }
        System.out.println(result1);

        List<Integer> list1 = List.of(3, 6, 9, 10);
        int sum1 = 0;
        for (Integer i : list1) {
            sum1 += i;
        }
        System.out.println(sum1);

        // stream 활용
        String result2 = list.stream()
                .reduce("", (result, e) -> result + e);
        System.out.println("result2 = " + result2);

        Integer sum2 = list1.stream()
                .reduce(0, (s, v) -> s + v);
        System.out.println("sum2 = " + sum2);

    }
}
