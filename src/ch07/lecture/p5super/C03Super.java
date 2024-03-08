package ch07.lecture.p5super;

public class C03Super {
}

class C03Parent {

    // 파라미터 있는 생성자 만들면
    // 파라미터 없는 생성자가 자동 추가되지 않음
    C03Parent() {
    }

    C03Parent(int age) {
    }

    C03Parent(String name, int age) {
    }
}

class C03Child extends C03Parent {
    C03Child() {
        // 상위타입의 파라미터없는 생성자가 없으므로 super()에서 오류남
//        super();
        // 그래서 파라미터있는 생성자 호출 코드를 명시적으로 작성해야함
//        super(3);
//        super("son", 33);
//        super();
    }
}
