package ch04.lecture.p2switch;

public class C01Switch {
    public static void main(String[] args) {

        System.out.println("statement 1");

        String city = "부산";

        switch (city) {
            // 값이 "서울"
            case "서울":
                System.out.println("statement 2");
                break;

            // 값이 "제주"
            case "제주":
                System.out.println("statement 3");
                break;

            // 값이 "부산"
            case "부산":
                System.out.println("statement 4");
                System.out.println("statement 4 - 1");
                break;

            // 위의 모든 case에 해당되지 않을 때
            default:
                System.out.println("statement 5");
                break;

        }


        System.out.println("statement 6");
        System.out.println("statement 7");
        System.out.println("statement 8");
        System.out.println("statement 9");
    }
}
