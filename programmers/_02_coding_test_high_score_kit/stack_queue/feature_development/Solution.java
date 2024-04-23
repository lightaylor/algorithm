package _02_coding_test_high_score_kit.stack_queue.feature_development;

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue q = new LinkedList();

        for(int i = 0; i < progresses.length; i++) {
            q.add((int)Math.ceil((double)(100 - progresses[i]) / speeds[i]));
        }

        while(!q.isEmpty()) {
            answer = compare(answer, (int)q.poll(), q, 1);
        }

        return answer;
    }

    public int[] compare(int[] answer, int init, Queue q, int counter) {
        if(q.peek() != null && init >= (int)q.peek()) {
            q.poll();
            answer = compare(answer, init, q, counter + 1);
        } else {
            answer = Arrays.copyOf(answer, answer.length+1);
            answer[answer.length - 1] = counter;
            return answer;
        }
        return answer;
    }
}