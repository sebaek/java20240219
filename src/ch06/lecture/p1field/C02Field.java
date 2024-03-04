package ch06.lecture.p1field;

public class C02Field {
    public static void main(String[] args) {
        // 09.Instance.png

        C02Car car1 = new C02Car();
        car1.color = "검은색";
        car1.weight = 999.99;

        C02Car car2 = new C02Car();
        car2.color = "흰색";
        car2.weight = 888.88;

        System.out.println(car1.color);
        System.out.println(car1.weight);

        System.out.println(car2.color);
        System.out.println(car2.weight);

    }
}
