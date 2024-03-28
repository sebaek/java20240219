package ch18.lecture.p5filter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class C09BufferedWriter {
    public static void main(String[] args) throws IOException {
        String file = "temp/output9.txt";
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < 10; i++) {
            bw.write("hello world!");
            bw.newLine();
        }
        bw.close();
    }
}
