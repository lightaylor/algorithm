package _00_coding_basics_training.day20.grouping_strings;

import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(String str : strArr) {
            int key = str.length();
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        answer = Collections.max(map.values());

        return answer;
    }
}
