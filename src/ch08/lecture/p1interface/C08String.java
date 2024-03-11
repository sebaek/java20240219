package ch08.lecture.p1interface;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C08String {
    public static void main(String[] args) {
        String s = "java";
        Object o = s;
        Serializable serializable = s;
        CharSequence charSequence = s;
        Comparable comparable = s;
        Constable constable = s;
        ConstantDesc constantDesc = s;

        comparable.compareTo("hello");
        charSequence.chars();

        System.out.println(s instanceof String); // true
        System.out.println(s instanceof Object); // true
        System.out.println(s instanceof Serializable); // true
        System.out.println(s instanceof CharSequence); // true
        System.out.println(s instanceof Comparable); // true
        System.out.println(s instanceof Constable); // true
        System.out.println(s instanceof ConstantDesc); // true

        System.out.println(charSequence instanceof CharSequence); // true
        System.out.println(charSequence instanceof String); // true? false?
        System.out.println(charSequence instanceof Serializable); // true? false?
    }
}
