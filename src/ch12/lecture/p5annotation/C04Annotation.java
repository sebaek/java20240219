package ch12.lecture.p5annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MyAnnotation4
public class C04Annotation {
    //    @MyAnnotation4
    private String field;

    @MyAnnotation4
    public void method1(@MyAnnotation4 String param) {

    }
}

// MyAnnotation4 작성
// TYPE, METHOD, PARAMETER 에만 사용 가능하도록 제한
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.PARAMETER})
@interface MyAnnotation4 {
}
