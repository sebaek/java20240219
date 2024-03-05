package ch06.lecture.p3constructor;

public class C07This {
}

class C07MyClass {
    String name;

    void method1() {
        System.out.println(name);
        System.out.println(this.name);
        method2();
        this.method2();
    }

    void method2() {

    }
}
