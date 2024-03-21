package ch15.sec08;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");
        Set<String> set = Set.of("A", "B", "C");
        Map.of(
                1, "A",
                2, "B",
                3, "C");

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        List<String> list3 = List.copyOf(list2);

        HashSet<String> set2 = new HashSet<>();
        set2.add("A");
        set2.add("B");
        set2.add("C");
        Set<String> set3 = Set.copyOf(set2);

        var map2 = new HashMap<Integer, String>();
        map2.put(1, "A");
        map2.put(2, "B");
        map2.put(3, "C");
        Map<Integer, String> map3 = Map.copyOf(map2);

        String[] arr = {"A", "B", "C"};
        List<String> list4 = Arrays.asList(arr);
//        list4.add("d");
        list4.set(0, "d");

        System.out.println("프로그램 종료");


    }
}
