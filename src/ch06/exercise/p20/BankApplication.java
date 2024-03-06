package ch06.exercise.p20;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[100];
        int numberOfAccount = 0;

        boolean run = true;
        while (run) {
            System.out.println("""
                    --------------------------------------
                    1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료 
                    --------------------------------------""");
            System.out.print("선택>");
            String menu = scanner.nextLine();

            switch (menu) {
                case "1" -> {
                    System.out.println("""
                            -------
                            계좌생성
                            ------- """);
                    System.out.print("계좌번호: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("계좌주: ");
                    String accountName = scanner.nextLine();
                    System.out.print("초기입금액: ");
                    int balance = Integer.parseInt(scanner.nextLine());

                    Account account = new Account();
                    account.setNumber(accountNumber);
                    account.setName(accountName);
                    account.setBalance(balance);

                    accounts[numberOfAccount] = account;
                    numberOfAccount++;

                    System.out.println("결과: 계좌가 생성되었습니다.");
                }
                case "2" -> {
                    System.out.println("""
                            -------
                            계좌목록
                            ------- """);
                    for (int i = 0; i < numberOfAccount; i++) {
                        System.out.println(STR."\{accounts[i].getNumber()}     \{accounts[i].getName()}     \{accounts[i].getBalance()}");
                    }
                }
                case "3" -> {
                    System.out.println("""
                            -------
                            예금
                            ------- """);
                    System.out.print("계좌번호: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("예금액: ");
                    int deposit = Integer.parseInt(scanner.nextLine());

                    // 계좌번호가 accountNumber인 계좌 찾기
                    for (int i = 0; i < numberOfAccount; i++) {
                        if (accounts[i].getNumber().equals(accountNumber)) {
                            int balance = accounts[i].getBalance();
                            accounts[i].setBalance(balance + deposit);
                        }
                    }
                }
                case "4" -> {
                    System.out.println("""
                            -------
                            출금
                            ------- """);
                    System.out.print("계좌번호: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("출금액: ");
                    int withdrawal = Integer.parseInt(scanner.nextLine());

                    // 계좌번호가 accountNumber인 계좌 찾기
                    for (int i = 0; i < numberOfAccount; i++) {
                        if (accounts[i].getNumber().equals(accountNumber)) {
                            int balance = accounts[i].getBalance();
                            accounts[i].setBalance(balance - withdrawal);
                        }
                    }

                    System.out.println("결과: 출금이 성공되었습니다.");
                }
                case "5" -> run = false;
            }
        }

        System.out.println("프로그램 종료");
        scanner.close();
    }
}
