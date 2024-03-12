package ch09.lecture.p2anonymous;

public class C07Sample {
    public static void main(String[] args) {
        // TODO : null 대신 익명클래스 객체 코드 작성

        Game rpsGame = null;
        // "가위", "바위", "보" 중 하나 출력
        rpsGame.play();

        Game lottoGame = null;
        // 초보자: 1~45 값 중 한개 출력
        // 중급자: 1~45 값 중 6개 중복없이 출력
        lottoGame.play();
    }
}

interface Game {
    void play();
}
