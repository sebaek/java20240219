package ch12.lecture.p5annotation;

@MyAnnotation5(name = "controller", type = 3, role = "admin")
public class C05Annotation {

    @MyAnnotation5(name = "method",
            type = 5,
            role = {"user", "admin"})
    public void method() {

    }
}

@interface MyAnnotation5 {
    // element(attribute 속성) 정의 가능
    String name();

    int type();

    String[] role();

}
