package ch06.lecture.p2method;

public class C01Method {
    public static void main(String[] args) {
        C01Person person1 = new C01Person();
        C01Person person2 = new C01Person();

        person1.walk(); // 기능(메소드) 실행
        person2.walk(); // 메소드 실행


    }
}

class C01Person {
    // 필드들...
    // 이름, 나이, 주소

    // 기능(메소드)들...
    void walk() {
        // 메소드가 실행하는 코드들
        // 변수, 연산자, 제어문
        System.out.println("걷습니다.");
    }
}


