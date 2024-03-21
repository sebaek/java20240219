package ch15.exercise.p9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);


        // 평균
        // 최고점수

        int maxScore = 0;
        String name = null;
        double sum = 0;
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            sum += entry.getValue();

            if (maxScore < entry.getValue()) {
                maxScore = entry.getValue();
                name = entry.getKey();
            }
        }
        double avg = sum / map.size();
        System.out.println("avg = " + avg);

        System.out.println("name = " + name);
        System.out.println("maxScore = " + maxScore);

    }
}
