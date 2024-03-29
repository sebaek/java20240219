package ch19.lecture.p1network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class C01Computer2 {
    public static void main(String[] args) throws IOException {
        //연결을 요구하는 쪽
        // socket 생성
        Socket socket = new Socket("172.30.1.73", 9000);
        try (socket) {
            // 입력 스트림 데코레이팅...
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            try (is; isr; br;) {
                String data = br.readLine();
                System.out.println("컴퓨터1이 보낸 메시지 = " + data);
            }
        }
    }
}
