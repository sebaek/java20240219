package ch05.lecture.p2string;

public class C05Replace {
    public static void main(String[] args) {
        // replace 특정 문자열을 바꾼 문자열을 리턴(원본 문자열이 바뀌지 않음)
        String s = "my name is son";
        String t = s.replace("my", "your");

        System.out.println(s);
        System.out.println(t);

        String u = "java, spring, css, java, html";
        String v = u.replace("java", "자바");
        System.out.println(u);
        System.out.println(v);

    }
}
