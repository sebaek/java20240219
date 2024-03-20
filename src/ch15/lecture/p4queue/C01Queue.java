package ch15.lecture.p4queue;

import java.util.LinkedList;
import java.util.Queue;

public class C01Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // 아이템 추가 (offer)
        queue.offer("java");
        queue.offer("spring");
        queue.offer("jdbc");
        queue.offer("mariadb");

        System.out.println(queue.size()); // 4

        // 아이템 꺼내기 (poll)
        String e1 = queue.poll();// java
        String e2 = queue.poll();// spring
        String e3 = queue.poll();// jdbc
        String e4 = queue.poll();// mariadb

        System.out.println(queue.size()); // 0

        System.out.println("e1 = " + e1);
        System.out.println("e2 = " + e2);
        System.out.println("e3 = " + e3);
        System.out.println("e4 = " + e4);
    }
}


