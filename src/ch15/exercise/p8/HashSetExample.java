package ch15.exercise.p8;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        set.add(new Student(1, "홍길동")); // true
        set.add(new Student(2, "신용권")); // true
        set.add(new Student(1, "조민우")); // false

        System.out.println("set.size() = " + set.size());
        System.out.println(set);

    }
}
