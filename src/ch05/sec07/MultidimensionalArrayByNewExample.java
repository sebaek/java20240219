package ch05.sec07;

import java.util.Arrays;

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


        int[][] englishScores = new int[2][];
//        System.out.println(Arrays.toString(englishScores));

        englishScores[0] = new int[2]; // [0, 0]
        englishScores[1] = new int[3]; // [0, 0, 0]

        for (int i = 0; i < englishScores.length; i++) {
            for (int j = 0; j < englishScores[i].length; j++) {
                System.out.println("englishScores[" + i + "][" + j + "]: " + englishScores[i][j]);
            }
        }

        englishScores[0][0] = 90;
        englishScores[0][1] = 91;
        englishScores[1][0] = 92;
        englishScores[1][1] = 93;
        englishScores[1][2] = 94;

        totalStudent = 0;
        int totalEnglishSum = 0;

        for (int[] englishClass : englishScores) {
            totalStudent += englishClass.length;
            for (int score : englishClass) {
                totalEnglishSum += score;
            }
        }

        double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
        System.out.println("전체 학생의 영어 평균 점수 = " + totalEnglishAvg);

    }

}
