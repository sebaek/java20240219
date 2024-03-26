package ch18.lecture.p1outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01OutputStream {
    public static void main(String[] args) throws IOException {
        // InputStream :
        // 프로그램 외부 입력을 바이트 단위로 받기 위한 객체의 클래스
        // OutputStream :
        // 프로그램 외부 출력을 바이트 단위로 하기 위한 객체의 클래스

        // Reader : 문자단위 입력 스트림
        // Writer : 문자단위 출력 스트림

        String fileName = "temp/output01.data";
        OutputStream os = new FileOutputStream(fileName);
        os.write(99);
        os.write(100);
        os.write(1000000000);

    }
}
