package _00_coding_basics_training.day14.in_groups_of_five;

import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        List<String> list = new ArrayList<>();

        for(int i = 0; i < names.length; i+=5) {
            list.add(names[i]);
        }

        answer = new String[list.size()];
        for(int j = 0; j < answer.length; j++) {
            answer[j] = list.get(j);
        }

        return answer;
    }
}
