package programmers._01_introduction_to_coding_tests.day23.unusual_sorting;

import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int id = 0;

        Arrays.sort(numlist);
        for (int i = 0; i < numlist.length; i++) {
            if (Math.abs(n - numlist[id]) > Math.abs(n - numlist[i])) {
                id = i;
            }
        }

        answer[0] = numlist[id];
        int x = id - 1;
        int y = id + 1;
        for (int i = 1; i < numlist.length; i++) {
            if (x >= 0 && y < numlist.length) {
                answer[i] = n - numlist[x] >= numlist[y] - n ?  numlist[y++] : numlist[x--];
            } else {
                answer[i] = x >= 0 ? numlist[x--] : numlist[y++];
            }
        }

        return answer;
    }
}
