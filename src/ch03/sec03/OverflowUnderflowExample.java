package ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;

        var1++;
        System.out.println("var1 = " + var1);
        var1++;
        System.out.println("var1 = " + var1);
        var1++;
        System.out.println("var1 = " + var1);
        var1++;
        System.out.println("var1 = " + var1);
        var1++;
        System.out.println("var1 = " + var1);


        System.out.println("---------------------------");
        // underflow
        byte var2 = -125;
        var2--;
        System.out.println("var2 = " + var2);
        var2--;
        System.out.println("var2 = " + var2);
        var2--;
        System.out.println("var2 = " + var2);
        var2--;
        System.out.println("var2 = " + var2);
        var2--;
        System.out.println("var2 = " + var2);
        var2--;
        System.out.println("var2 = " + var2);
    }
}
