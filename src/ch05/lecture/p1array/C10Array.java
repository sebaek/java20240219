package ch05.lecture.p1array;

public class C10Array {
    public static void main(String[] args) {
        int[] arr1;
        arr1 = new int[]{6, 4, 2}; // 배열의 길이와 각 원소가 정의됨

        int[] arr2 = {9, 3, 1, 0}; // 배열의 길이와 각 원소가 정의됨

        // 배열의 길이만 정의하기
        // 각 원소는 초기값(0)으로 정의됨 (* 책 172쪽 표 참고)
        int[] arr3;
        arr3 = new int[3]; // 배열의 길이(3)만 정의됨

        int[] arr4 = new int[4]; // 배열의 길이(4)만 정의됨
        var arr5 = new int[7]; // 배열이 길이(7)만 정의됨

        //
        int[] arr6 = new int[2];
        arr6[0] = 11;
        arr6[1] = 23;
//        arr6[2] = 45; // x

    }
}
