package ch15.lecture.p2set;

import ch08.exercise.p8.C;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class C04Equals {
    public static void main(String[] args) {
        Set<C04Book> set = new HashSet<>();
        set.add(new C04Book("이것이자바다"));
        set.add(new C04Book("모두의git"));
        set.add(new C04Book("html"));
        set.add(new C04Book("이것이자바다"));

        System.out.println(set.size());
        System.out.println(set);
    }
}

class C04Book {
    private String title;

    public C04Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "C04Book{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C04Book c04Book = (C04Book) o;
        return Objects.equals(title, c04Book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
