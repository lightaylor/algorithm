package programmers._00_coding_basics_training.day07.creating_an_array_2;

import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {-1};
        List<Integer> temp = new ArrayList<>();
        String pattern = "^[05]+$";

        for(Integer i = l; i <= r; i++) {
            if(i.toString().matches(pattern)) {
                temp.add((int)i);
            }
        }

        if(temp.size() > 0) {
            answer = new int[temp.size()];
            for(int j = 0; j < temp.size(); j++) {
                answer[j] = temp.get(j);
            }
        }
        return answer;
    }
}
