package ch07.lecture.p5super;

public class C01Super {
    public static void main(String[] args) {
        C01Child child = new C01Child();
        child.method1();
    }
}

class C01Parent {
    public int field1;

    public void method1() {
        System.out.println("부모 클래스의 메소드 코드 실행");
    }
}

class C01Child extends C01Parent {
    @Override
    public void method1() {
        // super : 상위 타입의 멤버(필드, 메소드)를 접근하기 위한 키워드
        super.method1();
        System.out.println(super.field1);

        System.out.println("자식 클래스의 메소드 코드 실행");
    }
}
