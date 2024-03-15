package ch13.lecture.p1generic;

public class C07WildCard {
    public static void main(String[] args) {
        C07Box<Number> box1 = new C07Box<>();
        method1(box1);
        C07Box<Integer> box2 = new C07Box<>();
        method1(box2); // x

        C07Box<Number> box3 = new C07Box<>();
        method2(box3);

        C07Box<Object> box4 = new C07Box<>();
        method2(box4);
    }

    // 파라미터로
    // (? extends) : 상한 와일드카드 (Upper Bounded Wildcard)
    // 를 쓰면 값을 안전하게 읽을 수 있다.
    private static void method1(C07Box<? extends Number> box) {
        Number n = box.getItem(); // ok
    }

    // 파라미터로
    // (? super) : 하한 와일드카드 (Lower Bounded Wildcard)
    // 를 쓰면 값을 안전하게 쓸 수 있다.
    private static void method2(C07Box<? super Number> box) {
        box.setItem(3);
        box.setItem(3.14);
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
