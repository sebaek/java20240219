package ch18.lecture.p4reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class C04Reader {
    public static void main(String[] args) throws IOException {
        String file = "temp/output3.txt";
        Reader reader = new FileReader(file);

        char[] chars = new char[5];
        int len = 0;

        while ((len = reader.read(chars)) != -1) {
            // 읽은 문자들 활용
            System.out.println("data = " + Arrays.toString(chars));
        }

        reader.close();

    }
}
