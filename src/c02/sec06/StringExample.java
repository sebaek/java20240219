package c02.sec06;

public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "프로그래머";
        System.out.println("name = " + name);
        System.out.println("job = " + job);

        String str = "나는 \"자바\"를 배웁니다.";  // 나는 "자바"를 배웁니다.
        System.out.println(str);

        str = "번호\t이름\t직업 "; // 번호  이름  직업
        System.out.println(str);

        System.out.print("나는\n"); // 나는(엔터)
        System.out.print("자바를\n"); // 자바를(엔터)
        System.out.print("배웁니다."); // 배웁니다.


    }
}
