package ch12.lecture.p5annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MyAnnotation3
public class C03Annotation {
    @MyAnnotation3
    private String name;

    @MyAnnotation3
    C03Annotation(@MyAnnotation3 String name) {
    }

    @MyAnnotation3
    public void method(@MyAnnotation3 String name) {
        @MyAnnotation3
        int variable;
    }


}

@Target({ElementType.METHOD,
        ElementType.PARAMETER,
        ElementType.TYPE,
        ElementType.FIELD,
        ElementType.CONSTRUCTOR,
        ElementType.LOCAL_VARIABLE})
@interface MyAnnotation3 {
}
