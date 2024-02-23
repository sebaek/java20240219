package ch03.lecture.p1arithemetic;

public class C06Divide {
    public static void main(String[] args) {
        // 실수(double)를 0으로 나누면 Infinity
        double a = 3.0;
        double b = 0.0;

        double c = a / b;
        System.out.println("c = " + c);

        double d = (-a) / b;
        System.out.println("d = " + d);

        double e = 0.0;
        double f = -0.0;

        double g = a / e; // Infinity
        double h = a / f; // -Infinity
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        // 실수에서 나머지(%)연산 시 NaN(Not A Number)
        double i = 3.0;
        double j = 0.0;
        double k = i % j;
        System.out.println("k = " + k);

        // Infinity 인지
        boolean l = Double.isInfinite(g);
        System.out.println("l = " + l);

        // NaN 인지
        boolean m = Double.isNaN(k);
        System.out.println("m = " + m);

        // Infinity와 연산결과는 Infinity or NaN
        double n = g - g;
        System.out.println("n = " + n);
        double o = g - 1000000000000000000000000000000000000000.0;
        System.out.println("o = " + o);
        // NaN과 연산결과는 NaN
        double p = n * 3.0;
        System.out.println("p = " + p);

    }
}
