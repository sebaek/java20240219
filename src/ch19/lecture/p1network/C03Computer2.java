package ch19.lecture.p1network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class C03Computer2 {
    public static void main(String[] args) throws IOException {
        // 서버에 연결해서 Socket 만들기
        Socket socket = new Socket("172.30.1.73", 9000);

        try (socket) {

            // Socket에서 InputStream 꺼내기
            // BufferedInputStream 연결
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());

            // 파일명 아무거나
            // FileOutputStream 만들기
            // BufferedOutputStream 연결
            String file = "temp/download.png";
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            try (bis; fos; bos) {

                // BufferedInputStream에서 읽은 데이터
                // BufferedOutputStream으로 쓰기
                byte[] data = new byte[300];
                int len = 0;

                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                // 마지막에 flush()
                bos.flush();
            }

        }

        // 끝.
    }
}
