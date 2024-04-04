package ch12.lecture.p4reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class C01Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<MyClass1> class1 = MyClass1.class;
        Class<?> class2
                = Class.forName("ch12.lecture.p4reflection.MyClass1");
        System.out.println(class1 == class2); // true, 같은 객체

        MyClass1 obj = new MyClass1();
        Class<? extends MyClass1> class3 = obj.getClass();

        System.out.println(class2 == class3); // true, 같은 객체

        Field[] fields = class1.getDeclaredFields();
        Constructor<?>[] constructors = class1.getDeclaredConstructors();
        Method[] methods = class1.getDeclaredMethods();

        System.out.println("필드 이름 출력");
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        System.out.println("생성자 이름 출력");
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
        }

        System.out.println("메소드 이름 출력");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}

class MyClass1 {
    private String name;
    private Integer age;

    public MyClass1() {
    }

    public MyClass1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void myMethod1(String param1, Double param2) {

    }

}
