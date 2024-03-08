package ch07.lecture.p3casting;

public class C02Casting {
    public static void main(String[] args) {
        C02Animal animal1 = new C02Tiger();
        C02Tiger tiger1 = (C02Tiger) animal1; // ok
        // 컴파일 오류(compile error(exception)) 아님
        // 실행 오류(runtime exception)
        C02Cat cat1 = (C02Cat) animal1;


        System.out.println("프로그램 종료");
    }
}

class C02Animal {
}

class C02Tiger extends C02Animal {
}

class C02Cat extends C02Animal {
}