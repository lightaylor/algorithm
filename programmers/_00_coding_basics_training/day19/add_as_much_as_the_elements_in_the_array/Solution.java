package programmers._00_coding_basics_training.day19.add_as_much_as_the_elements_in_the_array;

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();

        for(int i : arr) {
            for(int j = 0; j < i; j++) {
                result.add(i);
            }
        }

        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
