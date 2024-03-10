package _00_coding_basics_training.day07.creating_an_array_4;

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;

        while(i < arr.length) {
            if(stk.size() > 0 && stk.get(stk.size()-1) >= arr[i]) {
                stk.remove(stk.get(stk.size()-1));
            } else {
                stk.add(arr[i]);
                i++;
            }
        }

        int[] result = new int[stk.size()];
        int j = 0;
        for(int k : stk) {
            result[j++] = k;
        }

        return result;
    }
}
