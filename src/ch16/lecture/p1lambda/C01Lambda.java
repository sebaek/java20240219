package ch16.lecture.p1lambda;

public class C01Lambda {
    public static void main(String[] args) {
        C01MyInterface obj = new C01MyInterface() {
            @Override
            public void method1(int a, int b) {
                System.out.println("C01Lambda.method1");
            }

            @Override
            public void method2(String c, String d) {
                System.out.println("C01Lambda.method2");
            }
        };
    }
}

interface C01MyInterface {
    void method1(int a, int b);

    void method2(String c, String d);
}

