package ch13.exercise.p2;

public class Container<T> {
    private T item;

    public void set(T param) {
        item = param;
    }

    public T get() {
        return item;
    }
}
