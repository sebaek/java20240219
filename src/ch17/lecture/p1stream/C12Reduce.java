package ch17.lecture.p1stream;

import java.util.List;
import java.util.Optional;

public class C12Reduce {
    public static void main(String[] args) {
        List<String> list1 = List.of("j", "a", "v", "a");
        String reduce1 = list1.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println("reduce1 = " + reduce1);

        Optional<String> reduce2 = list1.stream()
                .reduce((a, b) -> a + b);
        String s = reduce2.get();
        System.out.println("s = " + s);

        List<String> list2 = List.of();

        String result3 = list2.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println("result3 = " + result3);

        Optional<String> reduce = list2.stream()
                .reduce((a, b) -> a + b);
        if (reduce.isPresent()) {
            // 실행안됨
            System.out.println("reduce = " + reduce.get());
        }


    }
}
