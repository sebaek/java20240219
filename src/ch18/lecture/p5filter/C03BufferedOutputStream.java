package ch18.lecture.p5filter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C03BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        String file1 = "temp/bigfile/output1.data";
        OutputStream os = new FileOutputStream(file1);

        byte[] data = new byte[1024];

        long start = System.currentTimeMillis();
        for (int i = 0; i < (1024 * 1024); i++) {
            os.write(data);
        }
        os.flush();
        os.close();

        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("time = " + time);

    }
}
