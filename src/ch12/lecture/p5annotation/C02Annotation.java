package ch12.lecture.p5annotation;

@MyAnnotation2
public class C02Annotation {
    @MyAnnotation2
    private String field;

    @MyAnnotation2
    public void method1(
            @MyAnnotation2
            String name) {
    }
}

// MyAnnotation2 만들기

