package ch19.lecture.p1network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class C04Computer1 {
    public static void main(String[] args) throws Exception {
        // ServerSocket 만들기
        ServerSocket serverSocket = new ServerSocket(9000);
        while (true) {// 연결 기다린 후
            // 연결되면 Socket 만들기
            Socket socket = serverSocket.accept();

            Thread t = new Thread(() -> {
                try (socket) {
                    // Socket에서 OutputStream 꺼내기
                    // BufferedOutputStream 연결
                    BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

                    // 파일은 아무거나
                    // FileInputStream 만들기
                    // BufferedInputStream 연결
                    String[] files = {"cat", "butterfly", "coffee", "dolphin", "eagle", "lion", "namsan", "roses", "tiger", "tulip"};
                    Random random = new Random();

                    FileInputStream fis = new FileInputStream("temp/images/" + files[random.nextInt(files.length)] + ".png");
                    BufferedInputStream bis = new BufferedInputStream(fis);

                    try (bos; fis; bis) {

                        // BufferedInputStream으로 읽은 데이터
                        // BufferedOutputStream으로 출력
                        byte[] data = new byte[1024];
                        int len = 0;
                        while ((len = bis.read(data)) != -1) {
                            bos.write(data, 0, len);
                        }

                        bos.flush();
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.err.println("오류1:" + socket.getRemoteSocketAddress());
                    }
                    // 마지막에 flush()

                    System.out.println("완료:" + socket.getRemoteSocketAddress());
                } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("오류2:" + socket.getRemoteSocketAddress());
                }
            });
            t.start();

            // 끝
        }
    }
}
