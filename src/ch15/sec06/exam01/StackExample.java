package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        var coinBox = new Stack<Coin>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        System.out.println(coinBox.get(0).getValue()); // 100원
        System.out.println(coinBox.get(3).getValue()); // 10원


        while (!coinBox.empty()) {
            Coin coin = coinBox.pop();
            System.out.println("coin = " + coin.getValue() + "원");
        }
    }
}
