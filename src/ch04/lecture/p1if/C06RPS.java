package ch04.lecture.p1if;

import java.util.Random;
import java.util.Scanner;

public class C06RPS {
    public static void main(String[] args) {
        // 가위바위보 게임 만들기
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("가위(1), 바위(2), 보(3) 를 선택하세요:");

        // 1, 2, 3
        int user = Integer.parseInt(scanner.nextLine());
        int computer = random.nextInt(1, 4);

        // 여러분들이 코드 작성
        System.out.println("user = " + user); // 가위, 바위, 보
        System.out.println("computer = " + computer); // 가위, 바위, 보

        // 누가 이겼는지? 또는 비겼는지 메세지 출력

    }
}
