package _01_introduction_to_coding_tests.day17.select_multiples_of_n;

import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int i : numlist) {
            if(i%n == 0)list.add(i);
        }

        int j = 0;
        answer = new int[list.size()];
        for(int i : list) {
            answer[j++] = i;
        }

        return answer;
    }
}
