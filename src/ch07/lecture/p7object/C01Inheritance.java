package ch07.lecture.p7object;

public class C01Inheritance {
    public static void main(String[] args) {
        String s = "java";
        Object o = s;

        boolean b1 = o.equals("hello");
        int h1 = o.hashCode();
        String s1 = o.toString();

        System.out.println(b1);
        System.out.println(h1);
        System.out.println(s1);

        System.out.println(s.equals("hello"));
        System.out.println(s.hashCode());
        System.out.println(s.toString());
    }
}
