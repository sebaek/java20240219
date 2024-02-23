package ch04.lecture.p2switch;

public class C06Switch {
    public static void main(String[] args) {
        String city = "대구";

        switch (city) {
            case "서울", "인천" -> System.out.println("수도권입니다.");
            case "광주", "전주" -> System.out.println("호남권입니다.");
            case "대구", "부산" -> {
                System.out.println("영남권입니다.");
                System.out.println("바다가 있습니다.");
            }
            default -> System.out.println("다른 도시 입니다.");
        }
    }
}
