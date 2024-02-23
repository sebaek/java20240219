package ch03.lecture.p1arithemetic;

public class C05Double {
    public static void main(String[] args) {
        // double은 근사치 저장
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println("c = " + c);

        // 해결책1 : BigDecimal 객체 사용

        // 해결책2 : 책: 정수로 바꿔서 연산해라
        int d = (int) (a * 10);
        int e = (int) (b * 10);
        int f = d + e;
        double g = f / 10.0;
        System.out.println("g = " + g);
    }
}
