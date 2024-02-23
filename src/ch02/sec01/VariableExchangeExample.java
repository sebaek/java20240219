package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ", y:" + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x + ", y:" + y);


        int a = 100;
        int b = 200;

        // 적절한 코드 작성
        // swap a, b

        int t = a;
        a = b;
        b = t;

        System.out.println(a); // 200
        System.out.println(b); // 100

    }
}
