package ch02.lecture.p02type;

import static java.lang.StringTemplate.STR;

public class C15StringTemplate {
    public static void main(String[] args) {
        // java 21
        // string template

        String name = "jane";
        String age = "50";

        // my name is jane and age is 50

        String desc1 = "my name is " + name + " and age is " + age;
        System.out.println(desc1);

        String desc2 = String.format("my name is %s and age is %s", name, age);
        System.out.println(desc2);

        String desc3 = STR."my name is \{name} and age is \{age}";
        System.out.println(desc3);

        //
        String address = "서울";
        String country = "한국";

        // 저는 한국에 있는 서울에 삽니다.
        String desc4 = STR."저는 \{country}에 있는 \{address}에 삽니다.";
        System.out.println(desc4);


    }
}
