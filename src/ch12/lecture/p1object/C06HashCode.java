package ch12.lecture.p1object;

public class C06HashCode {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");
        String s3 = new String("spring");

        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
    }
}
