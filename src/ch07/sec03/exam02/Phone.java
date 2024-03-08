package ch07.sec03.exam02;

public class Phone {
    public String model;
    public String color;

    // 파라미터 없는 생성자 없음
    

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone.Phone");
    }
}
