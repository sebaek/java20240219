package ch05.lecture.p2string;

public class C03Length {
    public static void main(String[] args) {
        String a = "son"; // 길이 3
        String b = "my shoes"; // 길이 8
        String c = "이것이 자바다"; // 길이 7
        String d = """
                hello
                world
                """; // 길이 12

        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(c.length());
        System.out.println(d.length());
    }
}
