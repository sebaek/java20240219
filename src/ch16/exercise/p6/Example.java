package ch16.exercise.p6;

public class Example {
    public static void main(String[] args) {
        double result = calc((x, y) -> (x / y));
        System.out.println("result = " + result);
    }

    private static double calc(Function fun) {
        double x = 10;
        double y = 4;

        return fun.apply(x, y);
    }
}


