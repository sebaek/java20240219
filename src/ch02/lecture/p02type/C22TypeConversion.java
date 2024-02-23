package ch02.lecture.p02type;

public class C22TypeConversion {
    public static void main(String[] args) {
        // 확인문제 5번
        byte byteValue = 10;
        char charValue = 'A';

        int intValue1 = byteValue;
        int intValue2 = charValue;
//        short shortValue = charValue; // x
        double doubleValue = byteValue;

        // 확인문제 6번
        int intValue3 = 10;
        char charValue3 = 'A';
        double doubleValue3 = 5.7;
        String strValue3 = "A";

        // 보기1
        double var1 = (double) intValue3; // 자동타입변환으로 가능
        // 보기2
        byte var2 = (byte) intValue3;
        // 보기3
        int var3 = (int) doubleValue3;
        // 보기4
        // 기본타입과 참조타입간의 형변환 안됨 (예외 있음)
//        char var4 = (char) strValue3;

    }
}
