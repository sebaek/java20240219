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

        System.out.println(System.identityHashCode(arr1));
        System.out.println(System.identityHashCode(arr2));

        int[] arr3 = {2, 3};
        int[] arr4 = Arrays.copyOf(arr3, 2);

        System.out.println(System.identityHashCode(arr3));
        System.out.println(System.identityHashCode(arr4));

        arr3[0] = 22;

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

    }
}
