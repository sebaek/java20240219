package ch15.lecture.p2set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("css");
        set.add("spring");

        // 전체 탐색
        // 향상된 for
        System.out.println("### 향상된 for");
        for (String item : set) {
            System.out.println(item);
        }

        // forEach 메소드
        System.out.println("### forEach");
        set.forEach(System.out::println);

        // Iterator 사용
        // hasNext 탐색할 아이템이 있는지?
        // next 다음 아이템 리턴
        System.out.println("### Iterator 사용");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
