package ch05.lecture.p1array;

import java.util.Scanner;

public class S23Scanner {
    public static void main(String[] args) {
        String s = "my age is 33 or 44";
        Scanner scanner = new Scanner(s);
        System.out.println(scanner.next()); // my
        System.out.println(scanner.next()); // age
        System.out.println(scanner.next()); // is
        System.out.println(scanner.nextInt()); // 33

        System.out.println(scanner.next()); // or

//        String numberStr = scanner.next();
//        int number = Integer.parseInt(numberStr);
//        System.out.println(number); // 44

        int number = scanner.nextInt();
        System.out.println(number);

    }
}
