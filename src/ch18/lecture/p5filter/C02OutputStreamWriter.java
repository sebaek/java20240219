package ch18.lecture.p5filter;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C02OutputStreamWriter {
    public static void main(String[] args) throws Exception {
        String file = "temp/output2.txt";
        OutputStream os = new FileOutputStream(file);

        // OutputStreamWriter :
        // 문자 단위 출력 스트림을 바이트 단위 출력 스트림 연결

        OutputStreamWriter osw = new OutputStreamWriter(os);

        char c1 = 'A';
//        os.write(c1);
        osw.write(c1);

        char c2 = '가';
//        os.write(c2);
        osw.write(c2);

        osw.close();
        os.close();
    }
}
