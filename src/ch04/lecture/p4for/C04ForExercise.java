package ch04.lecture.p4for;

public class C04ForExercise {
    public static void main(String[] args) {
        /*
        0
        1
        2
        3
        4
         */
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        /*
        1
        2
        3
        4
        5
         */
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        /*
        0
        2
        4
        6
        8
         */
        for (int i = 0; i <= 8; i += 2) {
            System.out.println(i);
        }
        /*
        2
        4
        6
        8
        10
         */
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        /*
        4
        3
        2
        1
        0
         */
        for (int i = 4; i >= 0; i--) {
            System.out.println(i);
        }

        /*
        5
        4
        3
        2
        1
         */
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

    }
}
