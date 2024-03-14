package ch16.lecture.p1lambda;

public class C16ConstructorReference {
    public static void main(String[] args) {
        C16MyInterface obj1 = chars -> new String(chars);
        C16MyInterface obj2 = String::new;
    }
}

// 4. 생성자 참조
@FunctionalInterface
interface C16MyInterface {
    String method(char[] chars);
}
