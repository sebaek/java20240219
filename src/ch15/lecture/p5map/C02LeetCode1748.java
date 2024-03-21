package ch15.lecture.p5map;

import java.util.HashMap;
import java.util.Map;

public class C02LeetCode1748 {
}

class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer value = map.get(num);
            if (value == null) {
                map.put(num, 1);
            } else {
                map.put(num, value + 1);
            }
        }

        int result = 0;
        var entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() == 1) {
                result += entry.getKey();
            }
        }

        return result;
    }
}
