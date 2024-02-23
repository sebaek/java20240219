package ch04.sec03;

import java.util.Random;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        Random random = new Random();
        int time = random.nextInt(8, 12);

        System.out.println("[현재 시간 : " + time + "시]");

        switch (time) {
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");
        }
    }
}
