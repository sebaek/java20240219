package ch15.lecture.p1list;

import java.util.List;

public class C04NestedList {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        System.out.println(array[1][1]); // 92
        System.out.println(array[2][2]); // 93
        System.out.println(array[1][0]); // 83

        //
        List<List<Integer>> list;

        System.out.println(list.get(1).get(1)); // 92
        System.out.println(list.get(2).get(2)); // 93
        System.out.println(list.get(1).get(1)); // 83

    }
}
