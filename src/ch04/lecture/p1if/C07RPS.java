package ch04.lecture.p1if;

import java.util.Random;
import java.util.Scanner;

public class C07RPS {
    public static void main(String[] args) {
        // 가위바위보 게임 만들기
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("가위(1), 바위(2), 보(3) 를 선택하세요:");

        // 1, 2, 3
        String s = scanner.nextLine();

        int user = switch (s) {
            case "1", "가위" -> 1;
            case "2", "바위" -> 2;
            case "3", "보" -> 3;
            default -> throw new IllegalStateException("Unexpected value: " + s);
        };
        
        int computer = random.nextInt(1, 4);

        // 여러분들이 코드 작성
        if (user == 1) {
            System.out.println("user = 가위 ✌️");
        } else if (user == 2) {
            System.out.println("user = 바위 ✊");
        } else if (user == 3) {
            System.out.println("user = 보 ✋");
        }


        if (computer == 1) {
            System.out.println("computer = 가위 ✌️");
        } else if (computer == 2) {
            System.out.println("computer = 바위 ✊");
        } else if (computer == 3) {
            System.out.println("computer = 보 ✋");
        }

        // 누가 이겼는지? 또는 비겼는지 메세지 출력
        // 비김 : user == computer
        // 이김 : user == 1 && computer == 3
        //       user == 2 && computer == 1
        //       user == 3 && computer == 2
        // 짐 : 나머지 모두
        if (user == computer) {
            System.out.println("비겼습니다. ");
        } else if (user == 1 && computer == 3) {
            System.out.println("사용자가 이겼습니다. 🎉");
        } else if (user == 2 && computer == 1) {
            System.out.println("사용자가 이겼습니다. 🎉");
        } else if (user == 3 && computer == 2) {
            System.out.println("사용자가 이겼습니다. 🎉");
        } else {
            System.out.println("사용자가 졌습니다. 😭");
        }

    }
}
