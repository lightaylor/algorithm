package programmers.practice_exercise.selecting_oranges;

import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int total = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < tangerine.length; i++) {
            if(map.containsKey(tangerine[i])) {
                map.put(tangerine[i], map.get(tangerine[i]) + 1);
            } else {
                map.put(tangerine[i], 1);
            }
        }

        List<Integer> tan = new ArrayList<>(map.values());
        Collections.sort(tan);

        int j = tan.size() - 1;
        while (total < k) {
            total += tan.get(j--);
            answer++;
        }

        return answer;
    }
}
