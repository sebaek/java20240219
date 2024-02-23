package ch03.lecture.p5ternary;

public class C01Ternary {
    public static void main(String[] args) {
        // 삼항연산자 (Ternary Operator, 조건연산자, Conditional operator)
        // 피연산자 갯수 : 3개
        // 첫번째 피연산자의 타입 : boolean
        // 다른 두 피연산자의 타입은 같아야함

        // 기호
        // ? :

        // 문법
        // 피연산자1 ? 피연산자2 : 피연산자3

        // 연산결과값은 : 피연산자2 또는 피연산자3

        int r1 = true ? 1 : 2;
        System.out.println("r1 = " + r1);

        int r2 = false ? 1 : 2;
        System.out.println("r2 = " + r2);

        int age = 30;
        String r3 = (age >= 20) ? "어른" : "아이";
        System.out.println("r3 = " + r3);

        age = 15;
        String r4 = (age >= 20) ? "어른" : "아이";
        System.out.println("r4 = " + r4);
    }
}
