package ch15.sec02.exam02;

import ch15.sec02.exam01.Board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) throws InterruptedException {
//        List<Board> list = new Vector<>();
//        List<Board> list = new ArrayList<>();
        List<Board> list = Collections.synchronizedList(new ArrayList<>());

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(new Board("제목" + i, "내용" + i, "저자" + i));
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                list.add(new Board("제목" + i, "내용" + i, "저자" + i));
            }
        });
        t1.start();
        t2.start();

        t2.join();
        t1.join();

        System.out.println("list.size() = " + list.size());
    }
}
