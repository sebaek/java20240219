package ch11.lecture.p3custom;

public class C02Custom {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
//            String message = e.getMessage();
//            System.out.println("message = " + message);
        }
    }

    public static void method1() throws Exception {
        throw new Exception("시간 초과");
    }
}
