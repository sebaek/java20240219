package ch06.exercise.p18;


public class ShopService {
    private static ShopService s;

    private ShopService() {
    }

    public static ShopService getInstance() {
        if (s == null) {
            s = new ShopService();
        }
        return s;
    }
}
