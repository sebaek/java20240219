package ch13.sec02.exam03;

public class Box<T> {

    public T content;

    public boolean compare(Box<T> other) {
        boolean b = content.equals(other.content);
        return b;
    }
}
