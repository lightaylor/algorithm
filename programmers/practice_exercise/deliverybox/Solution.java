package programmers.practice_exercise.deliverybox;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= order.length; i++) queue.add(i);

        Stack<Integer> stack = new Stack<>();
        for (int o : order) {
            while (!queue.isEmpty() && queue.peek() < o) {
                stack.push(queue.poll());
            }

            if (!queue.isEmpty() && queue.peek() == o) {
                queue.poll();
                answer++;
            } else if (!stack.isEmpty() && stack.peek() == o) {
                stack.pop();
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}
