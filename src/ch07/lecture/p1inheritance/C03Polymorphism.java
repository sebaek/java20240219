package ch07.lecture.p1inheritance;

public class C03Polymorphism {
    public static void main(String[] args) {
        C03Child1 child1 = new C03Child1();
        C03Parent parent1 = child1; // ok

        C03Parent child2 = new C03Child1(); // ok

        C03Child2 child02 = new C03Child2();
        C03Parent parent2 = child02; // ok

        C03Parent child022 = new C03Child2(); // ok

        C03Parent p1 = new C03Parent();
//        C03Child1 c1 = p1; // x
//        C03Child2 c2 = p1; // x

    }
}

class C03Parent {
}

class C03Child1 extends C03Parent {
}

class C03Child2 extends C03Parent {
}
