package _00_coding_basics_training.day09.creating_an_array_5;

import java.util.*;

class Solution {
    public int[] main(String[] intStrs, int k, int s, int l) {
        List<Integer> temp = new ArrayList<>();

        for(String str : intStrs) {
            int i = Integer.valueOf(str.substring(s, s+l));
            if (i > k)
                temp.add(i);
        }

        int[] answer = new int[temp.size()];
        int j = 0;
        for(int i : temp) {
            answer[j++] = i;
        }

        return answer;
    }
}
