package ch11.exercise.p8;

import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("file.txt");
            try (fw) {
                fw.write("java");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
