package ch06.lecture.p3constructor;

public class C04Constructor {
    public static void main(String[] args) {
        C04MyClass o1 = new C04MyClass("son", 33);
        C04MyClass o2 = new C04MyClass("lee", 22);

        System.out.println(o1.name + ", " + o1.age);
        System.out.println(o2.name + ", " + o2.age);


    }
}

class C04MyClass {
    String name;
    int age;

    C04MyClass(String initialName, int initialAge) {
        name = initialName;
        age = initialAge;
    }
}
