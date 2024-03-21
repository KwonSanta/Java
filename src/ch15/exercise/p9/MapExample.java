package ch15.exercise.p9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;
        int avgScore;

        // 전체 탐색
        // #1. keySet() 활용
/*
        Set<String> keys = map.keySet();
        for (String key : keys) {
            if (maxScore < map.get(key)) {
                maxScore = map.get(key);
                name = key;
            }
            totalScore += map.get(key);
        }
        avgScore = totalScore / map.size();
        System.out.println("평균 점수: " + avgScore);
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디: " + name);
 */

        // #2. entrySet 활용
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (maxScore < entry.getValue()) {
                maxScore = entry.getValue();
                name = entry.getKey();
            }
            totalScore += entry.getValue();
        }
        avgScore = totalScore / map.size();
        System.out.println("평균 점수: " + avgScore);
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디: " + name);
    }
}
