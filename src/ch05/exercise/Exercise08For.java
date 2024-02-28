package ch05.exercise;

public class Exercise08For {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        double sum = 0;
        int cnt = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                cnt++;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + (sum / cnt));
    }
}
