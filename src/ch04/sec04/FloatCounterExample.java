package ch04.sec04;

public class FloatCounterExample {
    public static void main(String[] args) {
        // for문의 index 변수는 정수형으로

        for (float i = 0.1F; i <= 1.0F; i += 0.1F) {
            System.out.println("i = " + i);
        }
    }
}
