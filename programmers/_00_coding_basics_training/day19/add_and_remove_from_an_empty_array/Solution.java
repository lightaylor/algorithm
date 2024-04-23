package _00_coding_basics_training.day19.add_and_remove_from_an_empty_array;

import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for(int j = 0; j < arr[i] ; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }

        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
