package c02.lecture.p02type;

public class C23String {
    public static void main(String[] args) {
        // 참조타입 String
        // 기본타입 <->참조타입 간의 형변환 안됨

        // 기본타입 <-> String 간의 변환은 메소드로 가능

        // 1. String -> 기본타입
        String a = "123";
        byte b = Byte.parseByte(a);
        short c = Short.parseShort(a);
//        char d;
        int e = Integer.parseInt(a);
        long f = Long.parseLong(a);
        float g = Float.parseFloat(a);
        double h = Double.parseDouble(a);

        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        // String -> 기본타입 파싱 실패
        String i = "가나다";
        int j = Integer.parseInt(i);

        // 2. 기본타입 -> String 변환

    }
}
