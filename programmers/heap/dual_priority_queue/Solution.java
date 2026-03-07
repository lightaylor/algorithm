package programmers.heap.dual_priority_queue;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] solution(String[] operations) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (String str : operations) {
            if (str.equals("D 1")) {
                queue.remove(queue.stream().max(Integer::compareTo).orElse(0));
            } else if (str.equals("D -1")) {
                queue.poll();
            } else {
                queue.add(Integer.parseInt(str.substring(2)));
            }
        }

        int[] answer = {0, 0};
        answer[0] = queue.stream().max(Integer::compareTo).orElse(0);
        answer[1] = queue.stream().min(Integer::compareTo).orElse(0);

        return answer;
    }
}
