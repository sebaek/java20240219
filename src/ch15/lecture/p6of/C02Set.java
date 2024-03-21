package ch15.lecture.p6of;

import java.util.Set;

public class C02Set {
    public static void main(String[] args) {
        Set<String> set1 = Set.of("spring", "java", "css", "react");
        System.out.println(set1);

//        set1.add("vue");

        Set<String> set2 = Set.of("spring", "java", "spring");
    }
}
