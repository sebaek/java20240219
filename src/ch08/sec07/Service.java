package ch08.sec07;

public interface Service {
    default void defaultMethod1() {
        System.out.println("Service.defaultMethod1");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("Service.defaultMethod2");
        defaultCommon();
    }

    private void defaultCommon() {
        //중복코
        System.out.println("Service.defaultCommon");
    }

    public static void staticMethod1() {
        System.out.println("Service.staticMethod1");
        staticCommon();
    }

    public static void staticMethod2() {
        System.out.println("Service.staticMethod2");
        staticCommon();
    }

    private static void staticCommon() {
        // 중복
        System.out.println("Service.staticCommon");
    }
}
