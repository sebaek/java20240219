package ch04.exercise;

public class Exercise01 {
    public static void main(String[] args) {
        int a = 3;
        switch (a) {
            case 3 -> System.out.println(a);
        }

        switch (a) {
            case 3:
                System.out.println(a);
                break;
        }

    }
}
