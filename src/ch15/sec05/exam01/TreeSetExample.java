package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        System.out.println("scores.first() = " + scores.first());
        System.out.println("scores.last() = " + scores.last());

        System.out.println("scores.lower(95) = " + scores.lower(95));
        System.out.println("scores.higher(95) = " + scores.higher(95));

        System.out.println("scores.floor(95) = " + scores.floor(95));
        System.out.println("scores.ceiling(85) = " + scores.ceiling(85));

        NavigableSet<Integer> descendingSet = scores.descendingSet();
        System.out.println("descendingSet = " + descendingSet);

    }
}
