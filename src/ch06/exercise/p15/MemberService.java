package ch06.exercise.p15;

public class MemberService {
    boolean login(String id, String password) {
        boolean isHong = id.equals("hong");
        boolean is12345 = password.equals("12345");

        boolean result = isHong && is12345;

        return result;
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}
