package ch12.sec11.exam01;

public class GetClassExample {
    public static void main(String[] args) {
        Class clazz = Car.class;

        System.out.println("package = " + clazz.getPackageName());
        System.out.println("simple = " + clazz.getSimpleName());
        System.out.println("name = " + clazz.getName());
    }
}
