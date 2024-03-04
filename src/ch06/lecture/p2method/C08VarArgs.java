package ch06.lecture.p2method;

public class C08VarArgs {
    public static void main(String[] args) {
        C08MyClass o1 = new C08MyClass();
        o1.method1();
        o1.method1(1);
        o1.method1(3, 3);
//        o1.method1(6, 7, 8); // x

        o1.method2();
        o1.method2(5);
        o1.method2(7, 8);
        o1.method2(100, 1, 2, 34, 5, 1, 5, 1);

    }
}

class C08MyClass {
    void method1() {
        System.out.println("C08MyClass.method1, 파라미터없음");
    }

    void method1(int a) {
        System.out.println("C08MyClass.method1, 파라미터 한개");
    }

    void method1(int a, int b) {
        System.out.println("C08MyClass.method1, 파라미터 두개");
    }

    // varargs (가변인자, 가변길이 매개변수)
    // 메소드 내에서 배열로 사용
    void method2(int... a) {
        System.out.println("C08MyClass.method2, 파라미터 0개 이상");
        System.out.println(a.length);
    }

    // 다른 파라미터와 함께 사용시 꼭 마지막에 넣어야함
    void method3(String s, int... a) {

    }

    void method4(String s, double n, int... a) {
        
    }
}
