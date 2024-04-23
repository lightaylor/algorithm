package _00_coding_basics_training.day07.creating_the_collatz_sequence;

import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        int i = 0;
        answer.add(n);

        while(n != 1) {
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
            answer.add(n);
        }

        int[] result = new int[answer.size()];

        i = 0;
        for(int j : answer) {
            result[i++] = j;
        }

        return result;
    }
}
