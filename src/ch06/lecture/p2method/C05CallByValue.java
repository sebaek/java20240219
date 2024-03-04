package ch06.lecture.p2method;

public class C05CallByValue {
    public static void main(String[] args) {
        C05MyClass obj1 = new C05MyClass();
        int[] a1 = new int[3];
        a1[0] = 99;
        System.out.println("a1[1] = " + a1[1]); // 0
        obj1.method1(a1);
        System.out.println("a1[1] = " + a1[1]); // 0? 100?

    }
}

class C05MyClass {
    void method1(int[] arr) {
        System.out.println(arr.length);
        System.out.println("arr[0] = " + arr[0]);

        arr[1] = 100;
    }
}
