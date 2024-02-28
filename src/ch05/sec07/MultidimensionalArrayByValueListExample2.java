package ch05.sec07;

public class MultidimensionalArrayByValueListExample2 {
    public static void main(String[] args) {
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };

        // 첫번째 반의 평균 점수
        int sum1 = 0;
        for (int score : scores[0]) {
            sum1 += score;
        }
        double avg1 = (double) sum1 / scores[0].length;
        System.out.println("첫번째반 평균:" + avg1);

        // 전체 평균 점수
        int sumAll = 0;
        int numOfStudents = 0;
        for (int[] classScores : scores) {
            numOfStudents += classScores.length;
            for (int score : classScores) {
                sumAll += score;
            }
        }
        double avgAll = (double) sumAll / numOfStudents;
        System.out.println("전체평균 = " + avgAll);

    }
}
