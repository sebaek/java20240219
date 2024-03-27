package ch18.lecture.p4reader;

import java.io.*;

public class C05CopyCode {
    public static void main(String[] args) {
        // todo: 텍스트 파일 복사
        // C05CopyCode.java 파일을
        // temp/C05CopyCode.txt 파일로 복사

        // Reader, Writer 활용

        String src = "src/ch18/lecture/p4reader/C05CopyCode.java";
        String des = "temp/C05CopyCode.txt";

        try {
            Reader reader = new FileReader(src);
            Writer writer = new FileWriter(des);
            try (reader; writer) {
                char[] chars = new char[50];
                int len = 0;

                while ((len = reader.read(chars)) != -1) {
                    writer.write(chars, 0, len);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
