package ch05.lecture.p2string;

import com.sun.security.jgss.GSSUtil;

public class C02String {
    public static void main(String[] args) {
        // string literal 값 사용시 참조값 같음

        String a = "son"; // new 생략
        String b = "lee";
        String c;
        c = "son";

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));

        String d = new String("son");
        System.out.println(System.identityHashCode(d));

        // 참조값 비교
        System.out.println(a == c); // true
        System.out.println(a == d); // false

        // 내용물 비교
        // String 비교는 equals 사용!!!!
        System.out.println(a.equals(c)); // true
        System.out.println(a.equals(d)); // true


    }
}
