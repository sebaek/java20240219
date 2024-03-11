package ch08.lecture.p1interface;

public class C03Method {
    public static void main(String[] args) {
        C03Pet pet1 = new C03Cat();
        C03Pet pet2 = new C03GoldFish();

        pet1.feed(); // 인스턴스 메소드 실행
        pet2.feed(); // 인스턴스 메소드 실행
    }
}

interface C03Pet {
    // 인터페이스의 메소드는 모두 public 추상 메소드
    // public abstract 생략 가능
    public abstract void feed();
}

abstract class C03Animal {
    abstract public void breathe();
}

class C03Cat extends C03Animal implements C03Pet {
    @Override
    public void breathe() {
        System.out.println("고양이가 폐로 숨쉼");
    }

    @Override
    public void feed() {
        System.out.println("고양이에게 닭가슴살을 줍니다.");
    }
}

class C03Tiger extends C03Animal {
    @Override
    public void breathe() {
        System.out.println("호랑이가 폐로 숨쉼");
    }
}

class C03GoldFish extends C03Animal implements C03Pet {
    @Override
    public void breathe() {
        System.out.println("금붕어가 아가미로 호흡함");
    }

    @Override
    public void feed() {
        System.out.println("금붕어에게 새우를 먹입니다.");
    }
}
