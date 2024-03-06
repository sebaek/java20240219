package ch06.sec13.exam03.package1;

public class B {

    public void method() {
        A a = new A();

        a.field1 = 1;
        a.field2 = 2;
//        a.field3 = 3; // private

        a.method1(); // public
        a.method2(); // package private
//        a.method3(); // private
    }
}
