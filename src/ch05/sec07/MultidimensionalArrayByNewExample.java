package ch05.sec07;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];

        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                System.out.println(STR."mathScores[\{i}][\{j}]: \{mathScores[i][j]}");
            }
        }

        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                System.out.println(STR."mathScores[\{i}][\{j}]: \{mathScores[i][j]}");
            }
        }

        int totalStudent = 0;
        int totalMathSum = 0;

        for (int i = 0; i < mathScores.length; i++) {
            totalStudent += mathScores[i].length;

            for (int j = 0; j < mathScores[i].length; j++) {
                totalMathSum += mathScores[i][j];
            }

        }

        double totalMathAvg = (double) totalMathSum / totalStudent;

        System.out.println("전체 학생의 수학 평균 점수 = " + totalMathAvg);
    }

}
