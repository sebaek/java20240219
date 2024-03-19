package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("홍길동", 30)); // true
        set.add(new Member("홍길동", 30)); // false

        System.out.println(set.size());
    }
}
