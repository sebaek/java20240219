package ch02.lecture.p02type;

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
//        int j = Integer.parseInt(i); // Exception 발생 (11장에서 설명됨)

        // 2. 기본타입 -> String 변환
        int k = 356;
        double l = 3.14;

        String m = String.valueOf(k);
        String n = String.valueOf(l);

        System.out.println("m = " + m);
        System.out.println("n = " + n);

        String o = k + ""; // String과 다른 타입간 더하기(+) 연산의 결과는 String임
        String p = l + "";

        System.out.println("o = " + o);
        System.out.println("p = " + p);
    }
}
