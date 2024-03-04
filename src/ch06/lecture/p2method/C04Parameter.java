package ch06.lecture.p2method;

public class C04Parameter {
    public static void main(String[] args) {
        C04Calculator cal = new C04Calculator();
        // 메소드 호출시 파라미터에 값(매개값, 인수, argument)을 줘야함
        cal.printSum(5, 7);
        cal.printSum(9, 13);
        cal.printSum(200, 300);

        cal.printDivide(3.14, 0.5);
        cal.printDivide(9.0, 3);
        cal.printDivide(10, 2);


    }
}

class C04Calculator {
    // 필드들...
    // 메소드들...
    void printSum(int a, int b) {

        int result = a + b;
        System.out.println("result = " + result);
    }

    // 이곳에 코드 작성해 보세요
    void printDivide(double x, double y) {
        double result = x / y;
        System.out.println("result = " + result);
    }
}
