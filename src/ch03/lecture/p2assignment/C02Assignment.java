package ch03.lecture.p2assignment;

public class C02Assignment {
    public static void main(String[] args) {
        // +=, -=, *=, /=, %=
        int a = 10;
        a = a + 5;
        System.out.println("a = " + a);

        int b = 10;
        b += 5;
        System.out.println("b = " + b);

        a = a - 3; // a -= 3
        System.out.println("a = " + a);

        b -= 3; // b = b - 3
        System.out.println("b = " + b);

        a = a * 2; // a *= 2
        System.out.println("a = " + a);

        b *= 2; // b = b * 2
        System.out.println("b = " + b);

        a = a / 4; // a /= 4
        System.out.println("a = " + a);

        b /= 4; // b = b / 4
        System.out.println("b = " + b);

        a = a % 5; // a %= 5
        System.out.println("a = " + a);

        b %= 5; // b = b % 5
        System.out.println("b = " + b);
    }

}
