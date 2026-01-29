package programmers._00_coding_basics_training.day21.national_competition_qualifying_exam;

import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {
                list.add(rank[i]);
                map.put(rank[i], i);
            }
        }

        Collections.sort(list);
        return 10000 * map.get(list.get(0)) + 100 * map.get(list.get(1)) + map.get(list.get(2));
    }
}
