package practice_exercise.making_a_hanburger;

import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int[] order = {1, 2, 3, 1};
        Stack<Integer> stack = new Stack<>();

        for (int i : ingredient) {
            stack.push(i);

            if (stack.size() >= order.length) {
                boolean isMatch = true;
                for (int j = 0; j < order.length; j++) {
                    if (stack.get(stack.size() - 1 - j) != order[order.length - 1 - j]) {
                        isMatch = false;
                        break;
                    }
                }

                if (isMatch) {
                    for (int k = 0; k < order.length; k++) stack.pop();
                    answer++;
                }
            }

        }
        return answer;
    }
}
