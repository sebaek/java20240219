package ch18.lecture.p2inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class C04InputStream {
    public static void main(String[] args) {
        String fileName = "temp/output9.data"; // 25 bytes
        try {
            InputStream is = new FileInputStream(fileName);
            try (is) {
                byte[] data = new byte[10];
                int len = 0;

                while ((len = is.read(data)) != -1) {
                    // 읽은 데이터를 활용
                    System.out.println("Arrays.toString(data) = " + Arrays.toString(data));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
