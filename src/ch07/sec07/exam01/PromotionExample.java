package ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        // promotion : 자동형변환
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        B b1 = d;
        C c1 = e;

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        
    }
}

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}
