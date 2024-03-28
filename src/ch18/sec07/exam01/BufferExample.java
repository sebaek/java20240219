package ch18.sec07.exam01;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) throws IOException {
        String originalFilePath1 = "temp/dog.png";
        String targetFilePath1 = "temp/dog2.png";
        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);

        String originalFilePath2 = "temp/dog.png";
        String targetFilePath2 = "temp/dog2.png";
        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBufferTime = copy(fis, fos);
        System.out.println("buffer없이 = " + nonBufferTime);

        long bufferTime = copy(bis, bos);

        System.out.println("buffer있이 = " + bufferTime);
    }

    private static long copy(InputStream is, OutputStream os) throws IOException {
        long start = System.nanoTime();
        while (true) {
            int data = is.read();
            if (data == -1) {
                break;
            }
            os.write(data);
        }
        os.flush();

        long end = System.nanoTime();
        return end - start;
    }
}
