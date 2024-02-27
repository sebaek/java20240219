package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = {"spring", "summer", "fall", "winter"};

        System.out.println("season[0] = " + season[0]);
        System.out.println("season[1] = " + season[1]);
        System.out.println("season[2] = " + season[2]);
        System.out.println("season[3] = " + season[3]);

        season[1] = "여름";
        System.out.println("season[1] = " + season[1]);
        System.out.println();

        int[] scores = {83, 90, 87};
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("sum = " + sum);
        double avg = (double) sum / 3;
        System.out.println("avg = " + avg);
    }
}
