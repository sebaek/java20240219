package ch05.lecture.p1array;

public class C20NestedArray {
    public static void main(String[] args) {
        // 07.2차원 배열.png
        int[] arr1 = {5, 8, 9};

        int[][] arr2 = {
                {80, 90, 96},
                {76, 88}
        };

        int[][] arr3 = arr2;

        arr3[0][1] = 33;

        System.out.println(arr3[0][1]); // 33
        System.out.println(arr2[0][1]); // 33? 90?

        arr3[1] = arr1;

        System.out.println(arr2[1][1]); // ?

    }
}
