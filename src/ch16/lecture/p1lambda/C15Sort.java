package ch16.lecture.p1lambda;

import java.util.Arrays;
import java.util.Comparator;

public class C15Sort {
    public static void main(String[] args) {
        String[] names = {"son", "kwang", "alex", "go", "johnes"};

        System.out.println("정렬전");
        System.out.println(Arrays.toString(names));

        sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("문자 코드 기준 정렬후");
        System.out.println(Arrays.toString(names));

        sort(names, (s1, s2) -> s1.length() - s2.length());
        System.out.println("글자 수 기준 정렬 후 ");
        System.out.println(Arrays.toString(names));

        sort(names, (s1, s2) -> s2.length() - s1.length());
        System.out.println("글자 수 기준 큰거 부터 정렬 후 ");
        System.out.println(Arrays.toString(names));

        sort(names, (s1, s2) -> s2.compareTo(s1));
        System.out.println("문자 코드 역순 정렬 후 ");
        System.out.println(Arrays.toString(names));
    }

    private static void sort(String[] arr, Comparator<String> comparator) {
        int loop = arr.length;

        for (int current = 0; current < loop; current++) {
            String min = arr[current];
            int minIndex = current;

            for (int i = current; i < loop; i++) {
//                int result = min.compareTo(arr[i]);
                int result = comparator.compare(min, arr[i]);
                if (result > 0) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            String temp = arr[current];
            arr[current] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
