package programmers._00_coding_basics_training.day22.delete_elements_from_an_array;

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};

        for(int i : arr) {
            if (Arrays.stream(delete_list).allMatch(num -> num != i)) {
                int[] temp = new int[answer.length + 1];
                for(int j = 0; j < answer.length; j++) {
                    temp[j] = answer[j];
                }
                temp[temp.length - 1] = i;
                answer = temp;
            }
        }
        return answer;
    }
}
