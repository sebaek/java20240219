package ch03.sec06;

public class CompareOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = char1 < char2;
        System.out.println("result4 = " + result4);

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);
        System.out.println("result5 = " + result5);

        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6);
        System.out.println("result6 = " + result6);

        // 실수간의 ==, != 연산은 매우 주의!!
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c == 0.3);

        boolean result7 = (num5 == (float) num6);
        System.out.println("result7 = " + result7);

        String str1 = "자바";
        String str2 = "Java";

        // String간의 비교는 equals 메소드 사용
        boolean result8 = str1.equals(str2);
        System.out.println("result8 = " + result8);
        boolean result9 = !str1.equals(str2);
        System.out.println("result9 = " + result9);

        String s = "자";
        String t = "바";
        String u = s + t;
        System.out.println("u = " + u);

        boolean b1 = (str1 == u);
        System.out.println("b1 = " + b1);

        boolean b2 = str1.equals(u);
        System.out.println("b2 = " + b2);
    }
}
