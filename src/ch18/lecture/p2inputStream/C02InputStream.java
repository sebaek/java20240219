package ch18.lecture.p2inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C02InputStream {
    public static void main(String[] args) {
        String fileName = "temp/test3.db";

        try (InputStream is = new FileInputStream(fileName)) {
            int data = 0;

            while ((data = is.read()) != -1) {
                System.out.println("data = " + data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
