package ch07.lecture.p3casting;

public class C03Casting {
    public static void main(String[] args) {
        // 11. 참조변수와 인스턴스.png
        C03Tiger tiger = new C03Tiger();
        C03Animal animal = tiger;

        tiger.breathe();
        animal.breathe();

        C03Tiger tiger2 = (C03Tiger) animal;
//        C03Cat cat2 = (C03Cat) animal;

        C03Animal animal3 = new C03Animal();
        C03Tiger tiger3 = (C03Tiger) animal3;
    }
}

class C03Animal {
    public void breathe() {
        System.out.println("숨쉬다");
    }
}

class C03Tiger extends C03Animal {
    @Override
    public void breathe() {
        System.out.println("호랑이가 숨쉰다.");
    }
}

class C03Cat extends C03Animal {
}
