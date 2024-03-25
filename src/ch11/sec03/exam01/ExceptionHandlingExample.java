package ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

//        String s = array[2]; // ArrayIndexOutOfBoundsException
//        Integer.parseInt(array[1]); // NumberFormatException

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("value = " + value);
            } catch (NumberFormatException e) {
                System.out.println("숫자 형식이 잘못됨");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 잘못됨");
            }
        }
    }
}
