package ch05.lecture.p2string;

public class C09Substring {
    public static void main(String[] args) {
        String s = "spring boot";

        // substring : 문자열의 일부분 리턴
        String s2 = s.substring(2, 5);// "rin"
        System.out.println("s2 = " + s2);

        System.out.println(s.substring(7, 11)); // "boot"
        System.out.println(s.substring(7, s.length())); // "boot"
        System.out.println(s.substring(7)); // "boot"


    }
}
