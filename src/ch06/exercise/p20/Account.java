package ch06.exercise.p20;

public class Account {
    private String number; // 계좌번호
    private String name; // 계좌주 이름
    private int balance; // 현재 잔액

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}
