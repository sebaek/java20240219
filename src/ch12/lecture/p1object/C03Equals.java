package ch12.lecture.p1object;

public class C03Equals {
    public static void main(String[] args) {
        C03MyClass obj1 = new C03MyClass();
        C03MyClass obj2 = new C03MyClass();
        C03MyClass obj3 = obj2;

        boolean b1 = obj1.equals(obj2); // false
        boolean b2 = obj1.equals(obj3); // false
        boolean b3 = obj2.equals(obj3); // true

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

    }
}

class C03MyClass {
    // toString
    // equals
}
