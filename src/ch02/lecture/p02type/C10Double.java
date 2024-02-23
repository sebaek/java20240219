package ch02.lecture.p02type;

import java.math.BigDecimal;

public class C10Double {
    public static void main(String[] args) {
        // double(float)은 근사 값으로 저장됨
        double a = 0.1;
        double b = 0.2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 연산시 원하지 않은 결과가 나올 수 있음
        double c = a + b;
        System.out.println("c = " + c);

        // BigDecimal 사용해서 문제 해결
        BigDecimal d = new BigDecimal("0.1");
        BigDecimal e = new BigDecimal("0.2");

        BigDecimal f = d.add(e);

        System.out.println("f = " + f);
    }
}
