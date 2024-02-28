package ch05.lecture.p1array;

import java.util.Arrays;

public class C19NestedArray {
    public static void main(String[] args) {
        // 06.2차원 배열.png

        int[][] arr1;
        arr1 = new int[2][];

        System.out.println(arr1.length); // 2
        System.out.println(Arrays.toString(arr1)); // [null, null]

        arr1[0] = new int[3];
        System.out.println(Arrays.toString(arr1)); // [@9283, null]
        System.out.println(Arrays.toString(arr1[0])); // [0, 0, 0]

        arr1[1] = new int[2];
        System.out.println(Arrays.toString(arr1[1])); // [0, 0]

    }
}
