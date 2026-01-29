package programmers.heap.spicier;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int s : scoville) queue.offer(s);

        int count = 0;
        while (queue.peek() < K) {
            if(queue.size() < 2) return -1;
            int a = queue.poll();
            int b = queue.poll();
            queue.offer(a + b * 2);
            count++;
        }

        return count;
    }
}
