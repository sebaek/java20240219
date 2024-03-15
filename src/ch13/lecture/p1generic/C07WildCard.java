package ch13.lecture.p1generic;

public class C07WildCard {

    private void method1(C07Box<> box) {
        
    }
}

class C07Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
