package ch05.lecture.p1array;

import java.util.Scanner;

public class C22Scanner {
    public static void main(String[] args) {
        String s = "your name is lee.";
        Scanner scanner = new Scanner(s);

        while (scanner.hasNext()) {
            String token = scanner.next();
            System.out.println(token);
        }
    }
}
