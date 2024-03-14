package ch12.lecture.p2wrapper;

public class C01WrapperClass {
    public static void main(String[] args) {
        // 기본 타입 8개를 감싼 참조타입(클래스) 8개
        // byte, short, int, long, float, double, boolean, char
        // Byte, Short, Integer, Long, Float, Double, Boolean, Character

        int a = 3;

        // boxing
        Integer c = Integer.valueOf(a); // 오래전...
        Integer b = a; // 현재 auto boxing

        long d = 5;
        Long e = d; // auto boxing

        double f = 3.14;
        Double g = f; // auto boxing

        char h = '가';
        Character i = h; // auto boxing

        boolean j = true;
        Boolean k = j; // auto boxing

    }
}
