package ch12.exercise.p17;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String id = "Angel1004";
        String regex = "[a-zA-Z][a-zA-Z0-9]{7,11}";
        boolean match = Pattern.matches(regex, id);

        System.out.println("match = " + match);// false
    }
}
