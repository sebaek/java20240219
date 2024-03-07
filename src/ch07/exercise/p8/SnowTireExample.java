package ch07.exercise.p8;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        System.out.println(System.identityHashCode(snowTire));
        System.out.println(System.identityHashCode(tire));

        tire.run();
        snowTire.run();
    }
}

class Tire {
    public void run() {
        System.out.println("일반 타이어가 굴러갑니다.");
    }
}

class SnowTire extends Tire {
    @Override
    public void run() {
        System.out.println("스노우 타이어가 굴러갑니다.");
    }
}
