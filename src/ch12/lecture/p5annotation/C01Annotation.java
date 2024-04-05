package ch12.lecture.p5annotation;

import java.util.List;

public class C01Annotation {
    public static void main(String[] args) {
        // annotation : 코드의 추가 정보
        // 컴파일러나 프레임워크나 빌드 툴 등 다른 도구들이 사용함

    }
}

@MyAnnotation1
class MyClass1 {
    @MyAnnotation1
    private String name;

    @MyAnnotation1
    MyClass1(
            @MyAnnotation1
            String name,
            @MyAnnotation1
            int age) {

    }

    @MyAnnotation1
    public String method(
            @MyAnnotation1
            Double param,
            @MyAnnotation1
            List<?> list) {

        @MyAnnotation1
        String variable;
        
        return null;
    }
}

@interface MyAnnotation1 {
}
