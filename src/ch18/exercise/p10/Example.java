package ch18.exercise.p10;

import java.io.*;

public class Example {
    public static void main(String[] args) throws IOException {
        String srcFilePath = "";
        String desFilePath = "";

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        try (in; br;) {
            System.out.print("원본 파일 경로:");
            srcFilePath = br.readLine();

            System.out.print("복사 파일 경로:");
            desFilePath = br.readLine();

            File srcFile = new File(srcFilePath);

            if (srcFile.exists()) {
                File desFile = new File(desFilePath);
                File folder = desFile.getParentFile();
                if (!folder.exists()) {
                    folder.mkdirs();
                }

                InputStream is = new FileInputStream(srcFile);
                BufferedInputStream bis = new BufferedInputStream(is);

                OutputStream os = new FileOutputStream(desFile);
                BufferedOutputStream bos = new BufferedOutputStream(os);

                try (is; bis; os; bos;) {
                    byte[] data = new byte[1024];
                    int len = 0;

                    while ((len = bis.read(data)) != -1) {
                        bos.write(data, 0, len);
                    }

                    System.out.println("복사가 성공되었습니다.");
                }

            } else {
                System.out.println("원본 파일이 존재하지 않습니다.");
            }
        }

    }
}
