package ch11.lecture.p1exception;

import java.util.List;
import java.util.Objects;

public class C08Polymorphism {
    public static void main(String[] args) {
        try {
            List.of().get(0); // exception 발생
            System.out.println("try 블럭 나머지 코드");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("catch 블럭 코드");
        }

        System.out.println("프로그램 종료");
    }
}
