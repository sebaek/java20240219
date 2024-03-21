package ch15.lecture.p5map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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


class Solution2 {
    public int sumOfUnique(int[] nums) {
        Set<Integer> set1 = new HashSet<>(); // 모두 담고
        Set<Integer> set2 = new HashSet<>(); // 중복인 것 담고

        for (int num : nums) {
            if (!set1.add(num)) {
                set2.add(num);
            }
        }

        int sum1 = 0;
        for (int num : set1) {
            sum1 += num;
        }

        int sum2 = 0;
        for (int num : set2) {
            sum2 += num;
        }

        return sum1 - sum2;

    }
}
