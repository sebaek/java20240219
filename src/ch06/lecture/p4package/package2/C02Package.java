package ch06.lecture.p4package.package2;

import ch06.lecture.p4package.package1.C01MyClass;

public class C02Package {
    public static void main(String[] args) {
        // 다른 패키지에 있는 클래스는 full name 사용해야 함
        // import 하면 short name 사용 가능
        C01MyClass o1 = new C01MyClass();
    }
}
