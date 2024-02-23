package ch04.lecture.p2switch;

public class C05Switch {
    public static void main(String[] args) {
        String city = "대구";

        switch (city) {
            case "서울":
            case "인천":
                System.out.println("수도권입니다.");
                break;
            case "광주", "전주":
                System.out.println("호남권입니다.");
                break;
            case "대구":
            case "부산":
                System.out.println("영남권입니다.");

        }
    }
}
