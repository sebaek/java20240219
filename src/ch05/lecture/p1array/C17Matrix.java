package ch05.lecture.p1array;

public class C17Matrix {
    public static void main(String[] args) {
        int[][] mat1 = new int[3][2]; // 3행 2열

        // mat1의 원소의 갯수는 3개, 그 타입은 int[]
        // mat1의 각 원소의 원소의 갯수는 2개, 그 타입은 int

        System.out.println(mat1.length); // 3
        System.out.println(mat1[0].length); // 2
        System.out.println(mat1[1].length); // 2
        System.out.println(mat1[2].length); // 2

        mat1[1][0] = 5; // 2번째행 1번째열의 값을 5
        mat1[2][1] = 9; // 3번째행 2번째열의 값을 9
        mat1[1][1] = 7;
        // 전체 탐색은 중첩된 for 사용
        for (int i = 0; i < mat1.length; i++) {
            System.out.print("[");
            for (int j = 0; j < mat1[i].length; j++) {
                if (j != 0) {
                    System.out.print(", ");
                }
                System.out.print(mat1[i][j]);
            }
            System.out.println("]");
        }

    }
}
