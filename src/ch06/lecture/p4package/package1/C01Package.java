package ch06.lecture.p4package.package1;

public class C01Package {
    public static void main(String[] args) {
        ch06.lecture.p4package.package1.C01MyClass o1
                = new ch06.lecture.p4package.package1.C01MyClass();

        // 같은 패키지에 있는 클래스는 short name 사용
        C01MyClass o2
                = new C01MyClass();
    }
}
