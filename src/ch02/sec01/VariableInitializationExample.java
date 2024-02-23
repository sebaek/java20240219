package ch02.sec01;

public class VariableInitializationExample {
    // 4~13 줄의 코드 작성
    public static void main(String[] args) {

        int value;
        value = 10;

        // 값이 없는 변수를 사용할 수 없음
        int result = value + 10;

        System.out.println(result);
    }
}
