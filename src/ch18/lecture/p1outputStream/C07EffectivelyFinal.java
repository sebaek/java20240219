package ch18.lecture.p1outputStream;

import java.util.Scanner;

public class C07EffectivelyFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // try with resources 문법에 사용할 수 있는 객체의 타입은
        // AutoCloseable
        try (scanner) {
            // scanner에서 읽는 작업들

        }
    }
}
