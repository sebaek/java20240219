package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        class OkListener implements Button.ClickListener {

            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        }

        btnOk.setClickListener(new OkListener());
        btnOk.click();


        Button btnCancel = new Button();
        class CancelListener implements Button.ClickListener {

            @Override
            public void onClick() {
                System.out.println("취소 버튼을 클릭했습니다.");
            }
        }

        btnCancel.setClickListener(new CancelListener());
        btnCancel.click();
    }
}
