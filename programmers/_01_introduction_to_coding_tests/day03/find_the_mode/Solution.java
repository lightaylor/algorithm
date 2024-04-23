package _01_introduction_to_coding_tests.day03.find_the_mode;

import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = -1;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            if(map.get(i) == null) map.put(i, 1);
            map.put(i, map.get(i) + 1);
        }

        for (int i : map.keySet()) {
            if (answer > 0 && map.get(i) == Collections.max(map.values()))
                return -1;
            answer = map.get(i) == Collections.max(map.values()) ? i : answer;
        }

        return answer;
    }
}
