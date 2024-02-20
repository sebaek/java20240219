package c02.lecture.p02type;

import java.util.Scanner;

public class C17Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력하세요:");
        String name = scanner.nextLine();

        System.out.println("나이를 입력하세요.");
        String age = scanner.nextLine();

        System.out.println("주소를 입력하세요.");
        String address = scanner.nextLine();

        String desc = STR."저는 \{address}에 사는 \{age}세 \{name} 입니다.";

        System.out.println("소개 = " + desc);

        scanner.close();
    }
}
