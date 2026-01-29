package programmers._02_coding_test_high_score_kit.dfs_bfs.target_number;
import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int sum = 0;
        int answer = 0;
        Queue<Integer> pQ = new LinkedList();
        Queue<Integer> mQ = new LinkedList();
        pQ.add(numbers[0]);
        mQ.add(-numbers[0]);

        for(int i = 1; i < numbers.length; i++) {
            for(int j = 1; j <= Math.pow(2, i-1); j++) {
                sum = pQ.poll();
                pQ.add(sum + numbers[i]);
                pQ.add(sum - numbers[i]);

                sum = mQ.poll();
                mQ.add(sum + numbers[i]);
                mQ.add(sum - numbers[i]);
            }
        }

        for(int j : pQ) {
            answer += mQ.poll() == target ? 1 : 0;
            answer += j == target ? 1 : 0;
        }

        return answer;
    }
}
