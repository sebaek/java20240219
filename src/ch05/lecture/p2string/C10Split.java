package ch05.lecture.p2string;

import java.util.Arrays;

public class C10Split {
    public static void main(String[] args) {
        // split :
        // 이 문자열을 주어진 정규 표현식(regular expression)과 일치하는 부분을 기준으로 분리

        String s1 = "hello world";
        String[] words1 = s1.split(" ");

        System.out.println(words1.length); // 2
        System.out.println(words1[0]); // hello
        System.out.println(words1[1]); // world

        String s2 = "css,react,html,spring";
        String[] words2 = s2.split(",");
        System.out.println(Arrays.toString(words2));

        String s3 = "spring";
        String[] words3 = s3.split("");
        System.out.println(Arrays.toString(words3));

        String s4 = "html,css, react";
        String[] words4 = s4.split(",\\s*"); // 책 12.10
        System.out.println(words4.length);
        System.out.println(Arrays.toString(words4));

    }

}
