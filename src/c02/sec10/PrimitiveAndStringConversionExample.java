package c02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);

        System.out.println(Boolean.parseBoolean("tRuE"));
        System.out.println(Boolean.parseBoolean("yes"));

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str4 = Double.toString(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);


        // 확인문제 10 (책 75쪽)
        String str = "5";
        byte var1 = Byte.parseByte(str);
        int var2 = Integer.parseInt(str);
        float var3 = Float.parseFloat(str);
        double var4 = Double.parseDouble(str);

    }
}
