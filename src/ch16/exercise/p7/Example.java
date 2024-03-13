package ch16.exercise.p7;

public class Example {
    private static int[] scores = {10, 50, 3};

    public static void main(String[] args) {
//        int max = maxOrMin((x, y) -> x > y ? x : y);
//        int max = maxOrMin((x, y) -> Math.max(x, y));
        int max = maxOrMin(Math::max);
        System.out.println("max = " + max);
//        int min = maxOrMin((x, y) -> x < y ? x : y);
//        int min = maxOrMin((x, y) -> Math.min(x, y));
        int min = maxOrMin(Math::min);
        System.out.println("min = " + min);

    }

    private static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
//            result = result > score ? result : score;
        }

        return result;
    }
}
