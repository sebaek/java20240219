package ch06.lecture.p3constructor;

public class C02Constructor {
    public static void main(String[] args) {
        C02MyClass obj1 = new C02MyClass();
        C02MyClass obj2 = new C02MyClass();

        System.out.println(obj1.age);
        System.out.println(obj2.age);
    }
}

class C02MyClass {
    int age;

    C02MyClass() {
        // 필드 초기값 설정
        age = 33;
    }
}
