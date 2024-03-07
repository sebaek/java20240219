package ch06.sec15;

public class SingletonExample {
    public static void main(String[] args) {
//        Singleton s1 = new Singleton();
//        Singleton s2 = new Singleton();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        System.out.println(s1 == s2); // true
    }
}
