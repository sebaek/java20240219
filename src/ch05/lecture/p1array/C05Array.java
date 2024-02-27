package ch05.lecture.p1array;

public class C05Array {
    public static void main(String[] args) {
        // 배열의 각 원소에 접근하는 법 : index 사용
        // index는 0부터 시작
        int[] arr = new int[]{100, 200, 300};

        // 0번 index : 100
        // 1번 index : 200
        // 2번 index : 300

        System.out.println(arr[0]); // 100
        System.out.println(arr[1]); // 200
        System.out.println(arr[2]); // 300

        arr[2] = 400;

        System.out.println(arr[2]); // 400

        // 존재하지 않는 index 사용 불가
        System.out.println(arr[3]); // 예외 발생

        
    }
}
