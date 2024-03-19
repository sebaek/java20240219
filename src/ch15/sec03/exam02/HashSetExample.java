package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("jdbc");
        set.add("jsp");
        set.add("spring");

        System.out.println(set.size());

        set.remove("jdbc");
        System.out.println(set.size());
    }
}
