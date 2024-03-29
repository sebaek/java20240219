package ch19.lecture.p1network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class C02Computer2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("172.30.1.73", 9000);

        try (socket) {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);

            Scanner scanner = new Scanner(System.in);

            try (os; osw; bw; pw; scanner) {
                while (true) {
                    System.out.print("입력>");
                    String data = scanner.nextLine();
                    pw.println(data);
                    if (data.equals("bye")) {
                        break;
                    }
                    pw.flush();
                }
            }
        }
    }
}
