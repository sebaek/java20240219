package ch13.sec01;

import java.util.*;

public class GenericExample {
    public static void main(String[] args) {
//        Box<String> box1 = new Box<String>();
//        Box<String> box1 = new Box<>();
        var box1 = new Box<String>();
        box1.content = "java";
        String str = box1.content;

        System.out.println(str);

//        Box<Integer> box2 = new Box<Integer>();
//        Box<Integer> box2 = new Box<>();
        var box2 = new Box<Integer>();
        box2.content = 100; // auto boxing
        int value = box2.content; // auto unboxing
        System.out.println(value);

        // 기본타입으로 타입파라미터 값 사용 못함
//        Box<int> box3 = new Box<>();

    }
}
