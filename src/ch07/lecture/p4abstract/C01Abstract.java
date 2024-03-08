package ch07.lecture.p4abstract;

public class C01Abstract {
    public static void main(String[] args) {
        C01Animal a1 = new C01Tiger();
        C01Animal b1 = new C01Cat();

        // 추상 클래스로 인스턴스 생성 불가
//        C01Animal c1 = new C01Animal(); // x
    }
}

// @formatter:off
// 추상 클래스 (abstract class)
abstract class C01Animal {}
class C01Tiger extends C01Animal {}
class C01Cat extends C01Animal {}
