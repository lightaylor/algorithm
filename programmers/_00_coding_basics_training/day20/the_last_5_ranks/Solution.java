package programmers._00_coding_basics_training.day20.the_last_5_ranks;

import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] sortedNumbers = Arrays.stream(num_list).sorted().toArray();
        int[] answer = new int[5];

        for(int i = 0; i < 5; i++) {
            answer[i] = sortedNumbers[i];
        }

        return answer;
    }
}
