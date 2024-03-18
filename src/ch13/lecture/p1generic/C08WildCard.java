package ch13.lecture.p1generic;

public class C08WildCard {
    public static void main(String[] args) {

    }

    public static void method1(C07Box<? extends Object> box) {
        Object o = box.getItem();
    }

    public static void method2(C07Box<?> box) {
        Object o = box.getItem();
    }
}
