package ch06.sec11.exam01;

import com.sun.security.jgss.GSSUtil;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-1234567", "감자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.nation);

//        k1.nation = "usa";//

        k1.name = "김자바";
    }
}
