package ch05.lecture.p1array;

import java.util.Arrays;

public class C14Copy {
    public static void main(String[] args) {
        int[] arr1 = {30, 40, 2, 1, 5};
        int[] arr2 = new int[5];

        System.arraycopy(arr1, 0, arr2, 0, 5);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println(System.identityHashCode(arr1));
        System.out.println(System.identityHashCode(arr2));

    }
}
