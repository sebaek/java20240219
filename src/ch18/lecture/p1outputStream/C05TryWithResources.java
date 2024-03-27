package ch18.lecture.p1outputStream;

import java.io.*;

public class C05TryWithResources {
    public static void main(String[] args) {
        String inputFileName = "temp/input5.data";
        String outputFileName = "temp/output5.data";


        try (InputStream is = new FileInputStream(inputFileName);
             OutputStream os = new FileOutputStream(outputFileName);) {
            // 읽는 작업
            // 쓰는 작업

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
