package programmers.stack_queue.process;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        for (int p : priorities) queue.add(p);

        Arrays.sort(priorities);
        int idx = priorities.length - 1;

        int answer = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == priorities[idx]) {
                answer++;
                idx--;

                if (location == 0) return answer;
            } else {
                queue.add(current);
            }

            location = (location == 0) ? queue.size() - 1 : location - 1;
        }

        return answer;
    }
}
