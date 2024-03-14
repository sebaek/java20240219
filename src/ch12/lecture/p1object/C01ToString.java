package ch12.lecture.p1object;

public class C01ToString {
    public static void main(String[] args) {
        C01MyClass1 ob1 = new C01MyClass1();
        C01MyClass2 ob2 = new C01MyClass2();
        Object o1 = ob1;
        Object o2 = ob2;
        Object o3 = new C01MyClass1();
        Object o4 = new C01MyClass2();
        String s1 = ob1.toString();
        String s2 = ob2.toString();
//        String s3 = o3.toString();
//        String s4 = o4.toString();

        String s5 = o1.toString();
        String s6 = o2.toString();

        System.out.println("s1 = " + s1);
        System.out.println("s5 = " + s5);

        System.out.println("s2 = " + s2);
        System.out.println("s6 = " + s6);
    }
}

class C01MyClass1 extends Object {
    @Override
    public String toString() {
        return "마이클래스1의 객체다";
    }
}

// extends Object
class C01MyClass2 {
    @Override
    public String toString() {
        return "마이클래스2의 객체다";
    }
}