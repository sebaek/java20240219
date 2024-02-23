package ch03.lecture.p4logical;

public class C02Not {
    public static void main(String[] args) {
        // ! : not
        // 피연산자 갯수 : 1개
        // 피연산자 타입 : boolean (true, false)
        // 연산결과 타입 : boolean (true, false)

        boolean b = !true; // false
        boolean b1 = !false; // true

        System.out.println("b = " + b);
        System.out.println("b1 = " + b1);
    }
}
