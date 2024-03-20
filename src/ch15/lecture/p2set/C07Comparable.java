package ch15.lecture.p2set;

import java.util.Objects;
import java.util.TreeSet;

public class C07Comparable {
    public static void main(String[] args) {
        var set = new TreeSet<C07Book>();
        set.add(new C07Book("모두의 git", 7000));
        set.add(new C07Book("이것이 자바다", 8000));
        set.add(new C07Book("react", 7500));

        System.out.println(set);

    }
}

class C07Book implements Comparable<C07Book> {
    private String title;
    private int price;

    public C07Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C07Book c07Book = (C07Book) o;
        return price == c07Book.price && Objects.equals(title, c07Book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "C07Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(C07Book o) {
//        return this.price - o.price;
        return this.title.compareTo(o.title);
    }
}
