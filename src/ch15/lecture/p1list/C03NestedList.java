package ch15.lecture.p1list;

import java.util.ArrayList;
import java.util.List;

public class C03NestedList {
    public static void main(String[] args) {
        // 원소가 String
        List<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("spring");

        // 원소가 List
        List<List<String>> list2 = new ArrayList<>();
        list2.add(new ArrayList<>());
        list2.add(new ArrayList<>());

        List<String> subList1 = list2.get(0);
        subList1.add("react");
        subList1.add("vue");

        list2.get(1).add("javascript");
        list2.get(1).add("rust");

        System.out.println(list2.get(0).get(1)); // vue
        System.out.println(list2.get(1).get(0)); // javascript
        System.out.println(list2.get(1).get(1)); // rust

    }
}
