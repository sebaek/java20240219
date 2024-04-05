package ch12.sec12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = Service.class.getDeclaredMethods();

        for (Method method : methods) {
            PrintAnnotation annotation = method.getAnnotation(PrintAnnotation.class);

            printLine(annotation);
            method.invoke(new Service());
            printLine(annotation);
        }
    }

    private static void printLine(PrintAnnotation annotation) {
        int number = annotation.number();
        for (int i = 0; i < number; i++) {
            String value = annotation.value();
            System.out.print(value);
        }
        System.out.println();
    }
}
