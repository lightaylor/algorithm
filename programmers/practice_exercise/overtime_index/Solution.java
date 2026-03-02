package programmers.practice_exercise.overtime_index;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public long solution(int n, int[] works) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        int sum = 0;
        for (int word : works) {
            queue.add(word);
            sum += word;
        }

        if (sum <= n) return 0;

        for (int i = 0; i < n; i++) {
            int q = queue.poll();
            if (q == 0) break;
            queue.add(q - 1);
        }

        long answer = 0;
        while (!queue.isEmpty()) {
            int work = queue.poll();
            answer += (long) work * work;
        }

        return answer;
    }
}
