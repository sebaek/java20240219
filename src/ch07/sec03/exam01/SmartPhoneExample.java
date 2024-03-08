package ch07.sec03.exam01;

import ch07.sec02.SmartPhone;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("갤럭시", "은색");

        System.out.println("phone.model = " + phone.model);
        System.out.println("phone.color = " + phone.color);
    }
}
