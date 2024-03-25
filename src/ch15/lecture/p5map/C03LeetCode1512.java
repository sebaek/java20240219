package ch15.lecture.p5map;

import java.util.*;
import java.util.function.Predicate;

public class C03LeetCode1512 {
}

class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        // 각 원소의 갯수 세어서
        // (원소, 원소수) 쌍의 맵 만들기
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer val = map.get(num);
            if (val == null) {
                map.put(num, 1);
            } else {
                map.put(num, val + 1);
            }
        }

        // 각 원소수로 n * (n-1) / 2 구해서
        // 모두 더하기
        int sum = 0;
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            Integer val = map.get(key);
            int r = val * (val - 1) / 2;
            sum += r;
        }

        // 위에서 모두 더한값 리턴
        return sum;

    }
}
