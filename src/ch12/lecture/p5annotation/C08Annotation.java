package ch12.lecture.p5annotation;

public class C08Annotation {
    @MyAnnotation8
    private String value1;
    @MyAnnotation8(value = 3, name = "model")
    private String value2;
    @MyAnnotation8(9)
    private String value3;
}

// MyAnnotation8 작성
@interface MyAnnotation8 {
    int value() default 0;

    String name() default "";
}
