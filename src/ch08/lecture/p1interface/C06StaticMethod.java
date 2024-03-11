package ch08.lecture.p1interface;

public class C06StaticMethod {
    public static void main(String[] args) {
        C06MyInterface.method1();
    }
}

interface C06MyInterface {
    // field (public static final)
    // abstract method (public abstract)
    // default method (public instance)

    // static method (public static )
    static void method1() {
        System.out.println("C06MyInterface.method1");
    }
}
