package ch15.lecture.p1list;

import java.util.ArrayList;
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

        // todo: 코드작성
        list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        list.get(0).add(95);
        list.get(0).add(86);

        list.get(1).add(83);
        list.get(1).add(92);
        list.get(1).add(96);

        list.get(2).add(78);
        list.get(2).add(83);
        list.get(2).add(93);
        list.get(2).add(87);
        list.get(2).add(88);

        System.out.println(list.get(1).get(1)); // 92
        System.out.println(list.get(2).get(2)); // 93
        System.out.println(list.get(1).get(0)); // 83

        System.out.println();

        List<List<Integer>> list2 = new ArrayList<>();
        List<Integer> subList1 = new ArrayList<>();
        subList1.add(95);
        subList1.add(86);
        List<Integer> subList2 = new ArrayList<>();
        subList2.add(83);
        subList2.add(92);
        subList2.add(96);
        List<Integer> subList3 = new ArrayList<>();
        subList3.add(78);
        subList3.add(83);
        subList3.add(93);
        subList3.add(87);
        subList3.add(88);

        list2.add(subList1);
        list2.add(subList2);
        list2.add(subList3);

        System.out.println(list2.get(1).get(1)); // 92
        System.out.println(list2.get(2).get(2)); // 93
        System.out.println(list2.get(1).get(0)); // 83


    }
}
