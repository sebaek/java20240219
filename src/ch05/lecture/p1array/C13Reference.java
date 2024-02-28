package ch05.lecture.p1array;

import java.util.Arrays;

public class C13Reference {
    public static void main(String[] args) {
        // 04.참조타입 (배열복사 예제).png
        int[] arr1 = {5, 4};
        int[] arr2 = arr1;

        arr1[0] = 10;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2)); // [10, 4]

    }
}
