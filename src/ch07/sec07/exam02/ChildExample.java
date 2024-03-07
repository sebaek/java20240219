package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();
        child.method3();

        Parent parent = child;
        System.out.println(System.identityHashCode(child));
        System.out.println(System.identityHashCode(parent));

        parent.method1();
        parent.method2();
//        parent.method3(); // x
    }
}
