package ch12.lecture.p5annotation;

public class C06Annotation {
    @MyAnnotation6(value = "hello", data = {4, 5})
    String name;

    @MyAnnotation6(value = "hi", data = 6)
    int age;
}

// MyAnnotation6 작성
