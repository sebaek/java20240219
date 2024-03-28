package ch18.lecture.p6file;

import java.io.File;

public class C03Directory {
    public static void main(String[] args) {
        String path = "temp/folder1";

        File file = new File(path);

        System.out.println("file.exists() = " + file.exists()); // false

        if (!file.exists()) {
            file.mkdir(); // directory 만들기
        }
        System.out.println("file.exists() = " + file.exists()); // true
        System.out.println("file.isDirectory() = " + file.isDirectory()); //true
    }
}
