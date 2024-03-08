package ch07.lecture.p7object;

import java.math.BigDecimal;
import java.util.Scanner;

public class C02Object {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        String s1 = "java";
        Scanner scanner = new Scanner("");
        BigDecimal bd = new BigDecimal("3");

        handleInstance(arr1);
        handleInstance(s1);
        handleInstance(scanner);
        handleInstance(bd);
    }

    public static void handleInstance(Object o) {
        String s = o.toString();
        int code = o.hashCode();
        boolean b = o.equals(null);

        System.out.println("s = " + s);
        System.out.println("code = " + code);
        System.out.println("b = " + b);
    }
}
