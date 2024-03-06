package ch06.sec13.exam03.package2;


import ch06.sec13.exam03.package1.A;

public class C {

    public C() {
        A a = new A();
        a.field1 = 1; // public
//        a.field2 = 3; // package private
//        a.field3 = 3; // private

        a.method1(); // public
//        a.method2(); // package private
//        a.method3(); // private
    }
}
