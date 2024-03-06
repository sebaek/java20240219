package ch06.sec13.exam02.package1;

public class A {

    A a1 = new A(true);
    A a2 = new A(3);
    A a3 = new A("문자열");

    // public 생성자
    public A(boolean b) {
    }

    // package private 생성자
    A(int b) {
    }

    // private 생성자
    private A(String s) {
    }
}
