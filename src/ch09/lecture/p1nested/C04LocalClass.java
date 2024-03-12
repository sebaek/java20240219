package ch09.lecture.p1nested;

public class C04LocalClass {
    void method1() {
        final int j = 1;
        int k = 2; // effectively final
//        k = 3; // 값 변경하면 local class에서 못씀
        class LocalClass {
            void method1() {
                int i = 0;
                System.out.println(i);
                i = 1; // ok

                // 감싸고 있는 메소드의 final 지역변수만 사용 가능
                System.out.println(j);
//                j = 5; // 감싸고 있는 메소드의 변수의 값 변경하면 안됨
                System.out.println(k);
            }
        }
    }
}
