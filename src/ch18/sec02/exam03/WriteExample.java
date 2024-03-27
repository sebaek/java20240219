package ch18.sec02.exam03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        OutputStream os = null;
        try {
            os = new FileOutputStream("temp/test3.db");
            byte[] array = {10, 20, 30, 40, 50};

            os.write(array, 1, 3); // 3 bytes

            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
