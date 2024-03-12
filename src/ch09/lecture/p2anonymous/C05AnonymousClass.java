package ch09.lecture.p2anonymous;

public class C05AnonymousClass {
    public static void main(String[] args) {

        method(new C05Parent() {
        });

    }

    public static void method(C05Parent param) {

    }
}

// @formatter:off
abstract class C05Parent {}
