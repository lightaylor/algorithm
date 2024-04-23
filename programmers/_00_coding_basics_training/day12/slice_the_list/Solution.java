package _00_coding_basics_training.day12.slice_the_list;

import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int j = 0;
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int m = n == 4 ? slicer[2] : 1;

        for(int i = start; i <= end; i+=m) {
            list.add(num_list[i]);
        }

        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
