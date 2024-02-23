package ch03.lecture.p1arithemetic;

public class C03Overflow {
    public static void main(String[] args) {
        // byte(1), short(2), int(4), long(8)
        // float(4), double(8)

        // overflow : 산술연산 시 저장공간의 한계를 넘어서 원하지 않는 값을 얻음
        int a = 2_000_000_000;
        int b = 1_000_000_000;

        int c = a + b;
        System.out.println("c = " + c);

        // overflow를 방지하려면
        // 적절한 data type을 선택해야함
        long d = 2_000_000_000;
        long e = 1_000_000_000;

        long f = d + e;
        System.out.println("f = " + f);

    }
}
