package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
//        var set = new TreeSet<Person>(());
        var set = new TreeSet<Person>((a, b) -> b.name.compareTo(a.name));
        set.add(new Person("홍길동", 45));
        set.add(new Person("감자바", 25));
        set.add(new Person("박지원", 31));

        for (Person person : set) {
            System.out.println(person.name + ":" + person.age);
        }
    }
}
