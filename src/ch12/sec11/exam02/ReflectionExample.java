package ch12.sec11.exam02;

import ch08.exercise.p6.Soundable;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        Class<Car> clazz = Car.class;

        System.out.println("[생성자 정보]");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "(");
            Class[] params = constructor.getParameterTypes();
            printParameters(params);
            System.out.println(")");
        }
        System.out.println();

        System.out.println("[필드 정보]");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType().getName() + " " + field.getName());
        }
        System.out.println();

        System.out.println("[메소드 정보]");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(method.getName() + "(");
            Class[] params = method.getParameterTypes();
            printParameters(params);
            System.out.println(")");
        }


    }

    private static void printParameters(Class[] params) {
        for (int i = 0; i < params.length; i++) {
            System.out.print(params[i].getName());

            if (i < params.length - 1) {
                System.out.print(", ");
            }
        }

    }
}
