package ch12.lecture.p2wrapper;

public class C03WrapperClass {
    public static void main(String[] args) {
        int a = 5;
        Integer b = 5; // auto boxing
        Number c = 5; // auto boxing
        Object d = 5; // auto boxing

        Integer e = null; // ok
//        int f = null; // x
    }
}
