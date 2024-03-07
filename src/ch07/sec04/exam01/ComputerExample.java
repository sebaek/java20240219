package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        double r1 = calculator.areaCircle(r);
        System.out.println("r1 = " + r1);

        Computer computer = new Computer();
        double r2 = computer.areaCircle(r);
        System.out.println("r2 = " + r2);


    }
}
