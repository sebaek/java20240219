package ch02.lecture.p02type;

public class C26Integer {
    public static void main(String[] args) {
        // byte, short, char 간의 연산결과는 int
        byte a = 100;
        byte b = 20;
        int c = a + b;

        System.out.println("c = " + c);

        char d = 'A';
        System.out.println("d = " + d);
        int e = d + 1;
        System.out.println("e = " + e);
        char f = (char) (d + 1);
        System.out.println("f = " + f);
    }
}
