package ch13.lecture.p1generic;

public class C01GenericType {
    public static void main(String[] args) {
        C01Box box = new C01Box();
        box.setItem("java");
        Object item = box.getItem();
        if (item instanceof String) {
            String str = (String) item;
            System.out.println("스트링에 관련된 일....");
        }

        C01Box box2 = new C01Box();
        box2.setItem(300);
        Object item2 = box2.getItem();
        if (item2 instanceof Integer) {
            Integer i = (Integer) item2;
            System.out.println("인티저 관련된 일....");
        }
    }
}

class C01Box {
    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}
