package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        Integer obj = 100; // auto boxing
        System.out.println("obj = " + obj.intValue());
        //obj.intValue() : 수동 언박싱
        System.out.println("obj = " + obj); // 재정의한 toString 호출
        System.out.println("obj = " + obj.toString()); // 재정의 toStrig 호출

        int value = obj; // auto unboxing
        System.out.println("value = " + value);

        int result = obj + 100; // auto unboxing
        System.out.println("result = " + result);

    }
}
