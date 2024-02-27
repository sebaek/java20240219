package ch05.lecture.p1array;

public class C04Array {
    public static void main(String[] args) {
        // 배열 : 같은 타입의 값을 여러개 갖는 자료형
        // 원소타입명[]

        // int 타입의 원소(element, item) 들을 갖는 배열
        int[] arr;

        // double 타입의 원소들을 갖는 배열
        double[] brr;

        // String 타입의 원소들을 갖는 배열
        String[] crr;


        // 실제 int 배열 객체를 만들고 변수에 할당
        arr = new int[]{6, 5, 7};

        // double 배열 객체를 만들고 변수에 할당
        brr = new double[]{3.14, 9.8};

        // String 배열 객체를 만들고 변수에 할당
        crr = new String[]{"java", "spring", "css"};


        // 다른 타입 원소를 넣을 수 없음
//        arr = new int[] {3, 3.14};
//        crr = new String[]{"html", 3};

        // 빈 배열
        crr = new String[]{};
    }
}
