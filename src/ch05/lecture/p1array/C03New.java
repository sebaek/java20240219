package ch05.lecture.p1array;

public class C03New {
    public static void main(String[] args) {

        // new : 메모리 공간 확보
        // 연산결과 : 확보된 메모리 공간 위치(주소, hashCode)

        int[] arr = new int[]{2, 3};

        // arr가 가진 실제 값을 알고 싶을 때
        // System.identityHashCode 메소드 사용
        int address = System.identityHashCode(arr);
        System.out.println(address);

    }
}
