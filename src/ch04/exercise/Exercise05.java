package ch04.exercise;

public class Exercise05 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                boolean result = (4 * x) + (5 * y) == 60;
                if (result) {
                    System.out.println(STR."(\{x}, \{y})");
                }
            }
        }
    }
}
