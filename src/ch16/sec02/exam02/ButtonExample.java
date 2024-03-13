package ch16.sec02.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        btnOk.setClickListener(() -> System.out.println("OK 버튼 클릭"));
        btnOk.click();

        Button btnCancel = new Button();

        btnCancel.setClickListener(() -> System.out.println("Cancel 버튼 클릭"));

        btnCancel.click();
    }
}
