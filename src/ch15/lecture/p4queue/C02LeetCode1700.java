package ch15.lecture.p4queue;

import java.util.LinkedList;
import java.util.Queue;

public class C02LeetCode1700 {
}

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        for (int student : students) {
            queue1.offer(student);
        }

        for (int sandwich : sandwiches) {
            queue2.offer(sandwich);
        }

        int remain = queue1.size();
        while (!queue1.isEmpty() && remain > 0) {
            int student = queue1.peek();
            int sandwich = queue2.peek();

            if (student == sandwich) {
                queue1.poll();
                queue2.poll();

                remain = queue1.size();
            } else {
                remain--;
                int s = queue1.poll();
                queue1.offer(s);
            }
        }

        return queue1.size();
    }
}
