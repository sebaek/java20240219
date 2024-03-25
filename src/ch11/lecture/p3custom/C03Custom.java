package ch11.lecture.p3custom;

public class C03Custom {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
//            String message = e.getMessage();
//            System.out.println("message = " + message);
        }
    }

    public static void method1() {
        throw new BreakDoorHandleException();
    }
}

// 직접 만드는 exception
// 1. Exception : checkedException
// 2. RuntimeException : uncheckedException
class BreakDoorHandleException extends RuntimeException {
    BreakDoorHandleException() {
    }

    BreakDoorHandleException(String message) {
        super(message);
    }
}
