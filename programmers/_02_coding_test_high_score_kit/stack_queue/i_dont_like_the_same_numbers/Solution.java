package _02_coding_test_high_score_kit.stack_queue.i_dont_like_the_same_numbers;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();

        list.add(arr[0]);
        for (int i=0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i+1]) {
                list.add(arr[i+1]);
            }
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
