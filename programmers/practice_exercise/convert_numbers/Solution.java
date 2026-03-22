package programmers.practice_exercise.convert_numbers;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int solution(int x, int y, int n) {
        if (x == y) {
            return 0;
        }

        boolean[] visited = new boolean[y + 1];
        Queue<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[]{x, 0});
        visited[x] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int value = current[0];
            int count = current[1];

            int[] nextValues = {value + n, value * 2, value * 3};
            for (int nextValue : nextValues) {
                if (nextValue > y || visited[nextValue]) {
                    continue;
                }
                if (nextValue == y) {
                    return count + 1;
                }

                visited[nextValue] = true;
                queue.offer(new int[]{nextValue, count + 1});
            }
        }

        return -1;
    }
}
