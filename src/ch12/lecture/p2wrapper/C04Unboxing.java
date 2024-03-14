package ch12.lecture.p2wrapper;

public class C04Unboxing {
    public static void main(String[] args) {
        Integer a = 3; // auto boxing

        // unboxing
        int c = a.intValue(); // 오래전 unboxing
        int b = a; // 현재 auto unboxing

        Long d = 5L;

        long e = d; // auto unboxing
        double f = e; // 기본 타입 형변환
        double g = d; // auto unboxing, 기본 타입 형변환

        Integer h = null;
        int i = h; // auto unboxing

        System.out.println("실행 종료");
    }
}
