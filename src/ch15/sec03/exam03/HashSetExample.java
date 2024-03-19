package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("jdbc");
        set.add("jsp");
        set.add("spring");

        System.out.println(set.size());

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("jsp")) {
                iterator.remove();
            }
        }


        set.remove("jdbc");
        System.out.println(set.size());

        for (String element : set) {
            System.out.println(element);
        }
    }
}
