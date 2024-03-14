package ch12.lecture.p1object;

public class C05HashCode {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o2;

        int h1 = o1.hashCode();
        int h2 = o2.hashCode();
        int h3 = o3.hashCode();

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

    }
}
