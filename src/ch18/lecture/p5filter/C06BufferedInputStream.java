package ch18.lecture.p5filter;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C06BufferedInputStream {
    public static void main(String[] args) throws IOException {
        String fileName = "temp/bigfile/output1.data";
        InputStream is = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(is);

        byte[] data = new byte[100];
        int len = 0;

        long start = System.currentTimeMillis();
        while ((len = bis.read(data)) != -1) {
            // 읽은 데이터 처리
        }
        bis.close();
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("time = " + time);

    }
}
