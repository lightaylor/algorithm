package programmers._01_introduction_to_coding_tests.day15.finding_divisors;

import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) list.add(i);
        }

        answer = new int[list.size()];
        int j = 0;
        for(int i : list){
            answer[j++] = i;
        }

        return answer;
    }
}
