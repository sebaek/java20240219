package ch19.lecture.p1network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class C06HttpServer {
    public static void main(String[] args) throws IOException {
        // 요청 메시지 보기
        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = serverSocket.accept();
        try (socket) {
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            try (is; isr; br) {
                while (true) {
                    String line = br.readLine();
                    System.out.println(line);
                    if (line.isBlank()) {
                        break;
                    }
                }
            }
        }
    }
}
