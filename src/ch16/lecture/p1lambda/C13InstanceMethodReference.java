package ch16.lecture.p1lambda;

import java.util.List;

public class C13InstanceMethodReference {
    public static void main(String[] args) {
        C13OtherClass obj1 = new C13OtherClass();
        C13MyInterface lambda1 = (i, j) -> obj1.someMethod(i, j);
        //   2. instance method 참조
        C13MyInterface lambda2 = obj1::someMethod;

        List.of(9, 10, 3, 23, 7)
                .forEach(x -> System.out.println(x));

        System.out.println();
        List.of(9, 10, 3, 23, 7)
                .forEach(System.out::println);
    }
}

class C13OtherClass {
    void someMethod(int a, int b) {
        System.out.println("어떤 일을함.. 중요하지 않음...");
    }
}

@FunctionalInterface
interface C13MyInterface {
    void method(int x, int y);
}
