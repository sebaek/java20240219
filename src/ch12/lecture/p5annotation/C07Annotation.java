package ch12.lecture.p5annotation;

public class C07Annotation {
    @MyAnnotation7
    private String field1;
    @MyAnnotation7(value = "hello", model = 9, role = {"admin"})
    private String field2;
    //    @MyAnnotation7(value = "hi")
    @MyAnnotation7("hi") // value만 사용시 생략 가능
    private String field3;
}

@interface MyAnnotation7 {
    String value() default "";

    int model() default 0;

    String[] role() default {};
}
