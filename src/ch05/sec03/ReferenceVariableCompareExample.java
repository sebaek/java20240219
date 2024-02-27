package ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {

        // 02.참조타입 설명.png

        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[]{1, 2, 3};
        arr2 = new int[]{1, 2, 3};
        arr3 = arr2;

        System.out.println(arr1 == arr2); // false
        System.out.println(arr2 == arr3); // true

        System.out.println(System.identityHashCode(arr1));
        System.out.println(System.identityHashCode(arr2));
        System.out.println(System.identityHashCode(arr3));
    }
}
