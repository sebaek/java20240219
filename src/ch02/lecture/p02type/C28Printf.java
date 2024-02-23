package ch02.lecture.p02type;

public class C28Printf {
    public static void main(String[] args) {
        // System.out.printf()

        // 파라미터 1개 (print와 유사)
        System.out.printf("hello world!");

        System.out.println();

        // 파라미터 2개 이상
        // 첫번째 파라미터 문자열에 두번째, 세번째,... 파라미터를 포함해서 출력
        System.out.printf("hello %s", "jane");

        System.out.println();
        // 파라미터 3개
        System.out.printf("hello %s and %s", "son", "park");

        System.out.println();

        String a = "son";
        String b = "park";
        System.out.println(STR."hello \{a} and \{b}"); // java 21 부터

        System.out.printf("%s %s - %s", "lee", "kang", "in");
        System.out.println();

        System.out.printf("%s %s %s", "son", "lee", "park");
        System.out.println();
        System.out.printf("%1$s %2$s %3$s", "son", "lee", "park");
        System.out.println();
        System.out.printf("%2$s %3$s %1$s", "son", "lee", "park");
        System.out.println();
        System.out.printf("%s %s %s %1$s %3$s %3$s", "son", "lee", "park");
        System.out.println();

        System.out.printf("%s", "son");
        System.out.println();
        System.out.printf("%5s", "son");
        System.out.println();
        System.out.printf("%-5s", "son");
        System.out.println();


        // 수형식 (정수)
        System.out.printf("%d", 345);
        System.out.println();
        System.out.printf("%5d", 345);
        System.out.println();
        System.out.printf("%-5d", 345);
        System.out.println();
        System.out.printf("%05d", 345);
        System.out.println();

        System.out.printf("%f", 3.141592);
        System.out.println();
        System.out.printf("%10f", 3.141592);
        System.out.println();
        System.out.printf("%-10f", 3.141592);
        System.out.println();
        System.out.printf("%010f", 3.141592);
        System.out.println();
        System.out.printf("%010.4f", 3.141592);
        System.out.println();

        System.out.printf("%%");
        System.out.println();

        System.out.printf("%n");
        System.out.println();


    }
}
