package ch15.lecture.p1list;

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

    }
}
