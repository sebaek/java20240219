package ch12.lecture.p3regex;

public class C04Quantifier {
    public static void main(String[] args) {
        // 수량자
        // {n} : 정확히 n번
        // {n,m} : n~m번
        // {n,} : n번 이상
        // + : {1,} : 1번 이상
        // * : {0,} : 0번 이상
        // ? : {0,1} : 한번 또는 없음


        // {n} : n번
        String p1 = "\\d{3}";
        System.out.println("012".matches(p1)); // true
        System.out.println("892".matches(p1)); // true
        System.out.println("89z".matches(p1)); // false
        System.out.println("6".matches(p1)); // false

        String p2 = "010-\\d{4}-\\d{4}";
        System.out.println("010-1234-9876".matches(p2));// true
        System.out.println("999-1234-9876".matches(p2)); // false
        System.out.println("010-333-5555".matches(p2)); // false
        System.out.println("010-3333-222".matches(p2)); // false
        System.out.println("01099998888".matches(p2)); // false

        // {n, m}
        String p3 = "[가-힣]{2,4}";
        System.out.println("손흥민".matches(p3)); // true
        System.out.println("이강인".matches(p3)); // true
        System.out.println("대한민국".matches(p3)); // true
        System.out.println("한국".matches(p3)); // true
        System.out.println("서울특별시".matches(p3)); // false

        // {n,}
        String p4 = "[가-힣]{2,}";
        System.out.println("손흥민".matches(p4)); // true
        System.out.println("이강인".matches(p4)); // true
        System.out.println("대한민국".matches(p4)); // true
        System.out.println("한국".matches(p4)); // true
        System.out.println("서울특별시".matches(p4)); // true
        System.out.println("한".matches(p4)); // false
        System.out.println("".matches(p4)); // false
        System.out.println("한국seoul".matches(p4)); //false

        String p5 = "[a-zA-Z가-힣]{1,}"; // 영문대소문자와 한글 한글자 이상
        System.out.println("한국".matches(p5)); // true
        System.out.println("korea".matches(p5)); // true
        System.out.println("seoul한국".matches(p5)); // true
        System.out.println("seoul 한국".matches(p5)); // false

        // ? : {0,1}
//        String p6 = "010-{0,1}\\d{4}-{0,1}\\d{4}";
        String p6 = "010-?\\d{4}-?\\d{4}";
        System.out.println("010-9999-8888".matches(p6)); // true
        System.out.println("01099998888".matches(p6)); // true
        System.out.println("0109999-8888".matches(p6)); // true
        System.out.println("010-99998888".matches(p6)); // true
        System.out.println("010-999-8888".matches(p6)); // false

        // + : 1번 이상
        String p7 = "\\w+";
        System.out.println("983jf_".matches(p7)); // true
        System.out.println("".matches(p7)); // false

        // * : 0번 이상
        String p8 = "\\w*";
        System.out.println("983jf_83jf".matches(p8)); // true
        System.out.println("".matches(p8)); // true
    }
}
