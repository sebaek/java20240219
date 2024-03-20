package ch15.exercise.p10;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        var set = new TreeSet<Student>();
        set.add(new Student("blue", 96));
        set.add(new Student("hong", 86));
        set.add(new Student("white", 92));

        Student student = set.last();
        System.out.println("student.score = " + student.score);
        System.out.println("student.id = " + student.id);
        System.out.println();

    }
}
