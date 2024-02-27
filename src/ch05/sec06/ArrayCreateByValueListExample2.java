package ch05.sec06;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores;

        scores = new int[]{83, 90, 87};

        int sum1 = 0;

//        sum1 += scores[0];
//        sum1 += scores[1];
//        sum1 += scores[2];

        for (int i = 0; i < scores.length; i++) {
            sum1 += scores[i];
        }

        System.out.println("sum1 = " + sum1);
    }
}
