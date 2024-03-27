package ch18.lecture.p3writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C02Writer {
    public static void main(String[] args) {
        // Writer : 문자 단위 출력 스트림
        String fileName = "temp/output2.txt";
        try {
            Writer writer = new FileWriter(fileName);

            try (writer) {
                writer.write(44145);
                writer.write('한');
                writer.write('z');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
