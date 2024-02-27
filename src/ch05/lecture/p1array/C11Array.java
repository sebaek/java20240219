package ch05.lecture.p1array;

public class C11Array {
    public static void main(String[] args) {
        int[] arr = new int[3];

        for (int item : arr) {
            System.out.println(item);
        }

        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 98;

        System.out.println("--------------");
        for (int item : arr) {
            System.out.println(item);
        }
    }
}
