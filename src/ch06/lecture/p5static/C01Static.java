package ch06.lecture.p5static;

public class C01Static {
    public static void main(String[] args) {
        C01MyClass o1 = new C01MyClass();
        o1.name = "son";
        C01MyClass o2 = new C01MyClass();
        o2.name = "lee";

        // 참조변수로 static 멤버(필드, 메소드) 사용 권장하지 않음
//        o1.location = "seoul";
        C01MyClass.location = "seoul"; // 권장되는 방법

        System.out.println("o1.name = " + o1.name);
        System.out.println("o2.name = " + o2.name);
        System.out.println("C01MyClass.location = " + C01MyClass.location); // ok
        System.out.println("o1.location = " + o1.location); // x
        System.out.println("o2.location = " + o2.location); // x)

        // static 메소드는 클래스로 접근해서 실행시키는 것을 권장
//        o1.method2();
        C01MyClass.method2();
    }
}

class C01MyClass {
    // 인스턴스 필드 (인스턴스 변수)
    String name;

    // static 필드 (class 변수)
    // 클래스의 정보
    static String location;

    // 인스턴스 메소드
    void method1() {
    }

    // static 메소드 (class 메소드)
    static void method2() {
    }
}
