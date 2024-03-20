package ch15.lecture.p2set;

import java.util.Objects;
import java.util.TreeSet;

public class C06Comparator {
    public static void main(String[] args) {
//        var set = new TreeSet<C06Book>((a, b) -> a.getPrice() - b.getPrice());
        var set = new TreeSet<C06Book>((a, b) -> a.getTitle().compareTo(b.getTitle()));
        set.add(new C06Book("이것이자바다", 30000));
        set.add(new C06Book("모두의git", 25000));
        set.add(new C06Book("react", 35000));

        System.out.println(set);

    }
}

class C06Book {
    private String title;
    private Integer price;

    public C06Book(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C06Book c06Book = (C06Book) o;
        return Objects.equals(title, c06Book.title) && Objects.equals(price, c06Book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    @Override
    public String toString() {
        return "C06Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
