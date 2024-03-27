package ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) throws Exception {
        write("문자 변환 스트림을 사용합니다.");
        String data = read();
        System.out.println("data = " + data);
    }

    private static String read() throws Exception {
        InputStream is = new FileInputStream("temp/test.txt");
        Reader reader = new InputStreamReader(is);
        char[] data = new char[100];
        int num = reader.read(data);
        reader.close();
        String str = new String(data, 0, num);
        return str;
    }


    private static void write(String str) throws Exception {
        OutputStream os = new FileOutputStream("temp/test.txt");
        Writer writer = new OutputStreamWriter(os);
        writer.write(str);
        writer.flush();
        writer.close();
    }
}
